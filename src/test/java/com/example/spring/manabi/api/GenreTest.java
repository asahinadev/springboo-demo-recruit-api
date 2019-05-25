package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.hotpepper.api.sub.Parameter;
import com.example.spring.manabi.request.v2.GenreRequest;
import com.example.spring.manabi.response.v2.GenreResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class GenreTest
		extends ApiTest<Genre, GenreRequest, GenreResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter($("J000001", "J000002")),
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	Genre api;

	@Override
	protected Genre api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new GenreRequest();
		request.setKey(config.getKey());
		request.setGenres(parameter.c1);
	}
}
