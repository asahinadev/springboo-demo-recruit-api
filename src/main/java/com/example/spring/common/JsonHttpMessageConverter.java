package com.example.spring.common;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

class JsonHttpMessageConverter extends AbstractJackson2HttpMessageConverter {

	private static ObjectMapper mapper() {

		ObjectMapper om = new ObjectMapper();

		om.setSerializationInclusion(Include.NON_NULL);
		om.setSerializationInclusion(Include.NON_EMPTY);

		return om;
	}

	public JsonHttpMessageConverter() {

		super(mapper());
	}

	@Override
	public List<MediaType> getSupportedMediaTypes() {

		// 強制的に実行
		return Arrays.asList(MediaType.ALL);
	}
}
