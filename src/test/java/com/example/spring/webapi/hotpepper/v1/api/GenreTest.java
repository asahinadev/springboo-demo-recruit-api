package com.example.spring.webapi.hotpepper.v1.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.webapi.hotpepper.v1.api.Genre;
import com.example.spring.webapi.hotpepper.v1.request.GenreRequest;
import com.example.spring.webapi.hotpepper.v1.responce.GenreResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class GenreTest
		extends ApiTest<Genre, GenreRequest, GenreResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter($("G001", "G002")),
				new Parameter("居酒屋"),
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
		request.setCodes(parameter.c1);
		request.setKeyword(parameter.k);
	}

}
