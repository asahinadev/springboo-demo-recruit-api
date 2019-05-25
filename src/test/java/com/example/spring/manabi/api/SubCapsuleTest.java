package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.hotpepper.api.sub.Parameter;
import com.example.spring.manabi.request.v2.SubCapsuleRequest;
import com.example.spring.manabi.response.v2.SubCapsuleResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SubCapsuleTest
		extends ApiTest<SubCapsule, SubCapsuleRequest, SubCapsuleResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter(1, $("SB00001", "SB00002")),
				new Parameter(2, $("G020001", "G020002")),
				new Parameter(3, $("G010001", "G010002")),
				new Parameter(4, $("J000001", "J000002")),
				new Parameter("英会話"),
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	SubCapsule api;

	@Override
	protected SubCapsule api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new SubCapsuleRequest();
		request.setKey(config.getKey());
		request.setSubCapsules(parameter.c1);
		request.setCapsules(parameter.c2);
		request.setCategories(parameter.c3);
		request.setGenres(parameter.c4);
	}
}
