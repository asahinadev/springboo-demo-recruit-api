package com.example.spring.hotpepper.parts;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;

class JsonHttpMessageConverter extends AbstractJackson2HttpMessageConverter {

	public JsonHttpMessageConverter() {
		super(new ObjectMapper());
	}

	@Override
	public List<MediaType> getSupportedMediaTypes() {
		// 強制的に実行
		return Arrays.asList(MediaType.ALL);
	}
}
