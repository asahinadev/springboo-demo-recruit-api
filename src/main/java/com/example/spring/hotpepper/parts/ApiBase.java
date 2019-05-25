package com.example.spring.hotpepper.parts;

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
import com.example.spring.hotpepper.parts.ResponseType.Results;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public abstract class ApiBase<I extends RequestType, O extends ResponseType<?>> {

	protected RestTemplate restTemplate = new RestTemplate(
			Arrays.asList(new JsonHttpMessageConverter()));

	@Autowired
	protected RecruitApiConfig config;

	public O accept(I request) {
		RequestEntity<?> entry;

		init();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(
				MediaType.APPLICATION_JSON,
				MediaType.APPLICATION_JSON_UTF8));

		if (method() == HttpMethod.GET) {
			URI uri = UriComponentsBuilder.fromUri(uri()).queryParams(request.convert()).build().toUri();
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
		Results results = response.getResults();

		if (results != null && results.getError() != null) {
			throw new IllegalStateException(results.getError().getMessage());
		}

		return response;

	}

	protected void init() {
		// nop
	}

	protected HttpMethod method() {
		return HttpMethod.GET;
	}

	protected abstract Class<O> type();

	protected abstract URI uri();
}
