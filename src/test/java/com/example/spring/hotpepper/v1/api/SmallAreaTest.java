package com.example.spring.hotpepper.v1.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.hotpepper.v1.api.SmallArea;
import com.example.spring.hotpepper.v1.request.SmallAreaRequest;
import com.example.spring.hotpepper.v1.responce.SmallAreaResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SmallAreaTest
		extends ApiTest<SmallArea, SmallAreaRequest, SmallAreaResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter(1, $("Z011", "Z011")), // L
				new Parameter(2, $("Y004", "Y005")), // M
				new Parameter(3, $("X004", "X005")), // S
				new Parameter("月島"), // K
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	SmallArea api;

	@Override
	protected SmallArea api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {

		log.debug("parameter {}", parameter);

		request = new SmallAreaRequest();
		request.setKey(config.getKey());
		request.setLargeAreas(parameter.c1);
		request.setMiddleAreas(parameter.c2);
		request.setSmallAreas(parameter.c3);
		request.setKeyword(parameter.k);
	}

}
