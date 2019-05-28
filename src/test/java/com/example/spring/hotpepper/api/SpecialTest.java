package com.example.spring.hotpepper.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.hotpepper.request.v1.SpecialRequest;
import com.example.spring.hotpepper.responce.v1.SpecialResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SpecialTest
		extends ApiTest<Special, SpecialRequest, SpecialResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter(1, $("SPA9", "SPC0")),
				new Parameter(2, $("LT0080", "LT0087")),
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	Special api;

	@Override
	protected Special api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new SpecialRequest();
		request.setKey(config.getKey());
		request.setSpecials(parameter.c1);
		request.setSpecialCategories(parameter.c2);
	}

}
