package com.example.spring.hotpepper.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.hotpepper.api.sub.Parameter;
import com.example.spring.hotpepper.request.v1.LargeAreaRequest;
import com.example.spring.hotpepper.responce.v1.LargeAreaResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class LargeAreaTest
		extends ApiTest<LargeArea, LargeAreaRequest, LargeAreaResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter($("Z011", "Z011")), // L
				new Parameter("月島"), // K
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	LargeArea api;

	@Override
	protected LargeArea api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new LargeAreaRequest();
		request.setKey(config.getKey());
		request.setLargeAreas(parameter.c1);
		request.setKeyword(parameter.k);
	}

}