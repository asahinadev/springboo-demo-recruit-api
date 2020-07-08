package com.example.spring.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.spring.config.ApiConfig;

import reactor.core.publisher.Mono;

public class CommonController {

	@Autowired
	ApiConfig config;

	public <E> Mono<E> get(
			WebClient client,
			String path, MultiValueMap<String, String> params,
			Class<E> clazz) {

		return client.get()
				.uri(b -> b.path(path).queryParams(params).build())
				.accept(MediaType.APPLICATION_JSON,
						MediaType.valueOf("text/javascript;charset=UTF-8"))
				.retrieve()
				.bodyToMono(clazz);
	}

}
