package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.manabi.request.v2.CapsuleTypeRequest;
import com.example.spring.manabi.response.v2.CapsuleTypeResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CapsuleTypeTest
		extends ApiTest<CapsuleType, CapsuleTypeRequest, CapsuleTypeResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter($("03", "01")),
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	CapsuleType api;

	@Override
	protected CapsuleType api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new CapsuleTypeRequest();
		request.setKey(config.getKey());
		request.setCapsuleTypes(parameter.c1);
	}
}
