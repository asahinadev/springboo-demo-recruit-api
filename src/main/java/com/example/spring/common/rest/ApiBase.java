package com.example.spring.common.rest;

import java.net.URI;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.spring.config.RecruitApiConfig;
import com.example.spring.util.ClassUtil;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public abstract class ApiBase<
// @formatter:off
		I extends RequestType, 
		O extends ResponseType<? extends ResponseType.Results>
		// @formatter:on
> {

	protected RestTemplate restTemplate;

	public ApiBase() {

		restTemplate = new RestTemplate(
				Arrays.asList(new JsonHttpMessageConverter()));
		restTemplate.setInterceptors(Arrays.asList(
				new LoggingClientHttpRequestInterceptor()));
	}

	@Autowired
	protected RecruitApiConfig config;

	public final O accept(I request) {

		RequestEntity<?> entry;

		init();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(
				MediaType.APPLICATION_JSON,
				MediaType.APPLICATION_JSON_UTF8));

		if (method() == HttpMethod.GET) {
			URI uri = UriComponentsBuilder.fromUri(uri()).queryParams(request.convert()).encode().build().toUri();
			log.info("uri       = {}", uri);
			entry = new RequestEntity<>(method(), uri);
		} else {
			URI uri = uri();
			log.info("uri       = {}", uri);
			log.info("parameter = {}", request.convert());
			entry = new RequestEntity<>(request.convert(), new HttpHeaders(), method(), uri);
		}

		ResponseEntity<O> responseEntity = restTemplate.exchange(entry, type());

		if (responseEntity.getStatusCodeValue() != 200) {
			throw new NoSuchElementException();
		}

		O response = responseEntity.getBody();
		ResponseType.Results results = response.getResults();

		if (results != null && results.isError()) {
			throw new IllegalStateException(results.getError().get(0).getMessage());
		}

		return response;

	}

	protected void init() {

		// nop
	}

	protected HttpMethod method() {

		return HttpMethod.GET;
	}

	@SneakyThrows
	protected final Class<O> type() {

		return ClassUtil.getGenericType(this, ApiBase.class, 1);
	}

	protected abstract URI uri();
}
