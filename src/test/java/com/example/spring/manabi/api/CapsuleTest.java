package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.manabi.request.v2.CapsuleRequest;
import com.example.spring.manabi.response.v2.CapsuleResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CapsuleTest
		extends ApiTest<Capsule, CapsuleRequest, CapsuleResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter(1, $("G020001", "G020002")),
				new Parameter(2, $("G010001", "G010002")),
				new Parameter(3, $("J000001", "J000002")),
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	Capsule api;

	@Override
	protected Capsule api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new CapsuleRequest();
		request.setKey(config.getKey());
		request.setCapsules(parameter.c1);
		request.setCategories(parameter.c2);
		request.setGenres(parameter.c3);
	}
}
