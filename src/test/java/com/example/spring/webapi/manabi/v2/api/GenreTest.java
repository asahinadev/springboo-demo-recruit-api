package com.example.spring.webapi.manabi.v2.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.manabi.v2.api.Genre;
import com.example.spring.webapi.manabi.v2.request.GenreRequest;
import com.example.spring.webapi.manabi.v2.response.GenreResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class GenreTest
		extends ApiTest<Genre, GenreRequest, GenreResponse> {

	@Parameterized.Parameters
	public static List<GenreRequest> data() {
		return Arrays.asList(
				GenreRequest.of().genres($("J000001")).build(),
				GenreRequest.of().build());
	}

	final GenreRequest parameter;

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
		request = parameter;
		request.setKey(config.getKey());
	}
}
