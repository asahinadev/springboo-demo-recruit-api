package com.example.spring.common;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingClientHttpRequestInterceptor
		implements ClientHttpRequestInterceptor {

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {

		ClientHttpResponse responce = execution.execute(request, body);
		responce = new ClientHttpResponseWrapper(responce);

		log.info("request {} {}", request.getMethod(), request.getURI());
		log.info("body    {}", ((ClientHttpResponseWrapper) responce).getBodyText());

		return responce;
	}

}