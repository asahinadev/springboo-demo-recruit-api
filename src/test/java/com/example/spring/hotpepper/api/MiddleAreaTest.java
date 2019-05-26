package com.example.spring.hotpepper.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.hotpepper.api.sub.Parameter;
import com.example.spring.hotpepper.request.v1.MiddleAreaRequest;
import com.example.spring.hotpepper.responce.v1.MiddleAreaResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class MiddleAreaTest
		extends ApiTest<MiddleArea, MiddleAreaRequest, MiddleAreaResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter(1, $("Z011", "Z011")), // L
				new Parameter(2, $("Y004", "Y005")), // M
				new Parameter("月島"), // K
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	MiddleArea api;

	@Override
	protected MiddleArea api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new MiddleAreaRequest();
		request.setKey(config.getKey());
		request.setLargeAreas(parameter.c1);
		request.setMiddleAreas(parameter.c2);
		request.setKeyword(parameter.k);
	}

}
