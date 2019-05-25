package com.example.spring.hotpepper.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.hotpepper.api.sub.Parameter;
import com.example.spring.hotpepper.request.v1.SpecialCategoryRequest;
import com.example.spring.hotpepper.responce.v1.SpecialCategoryResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SpecialCategoryTest
		extends ApiTest<SpecialCategory, SpecialCategoryRequest, SpecialCategoryResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter($("SPA9", "SPC0")),
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	SpecialCategory api;

	@Override
	protected SpecialCategory api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new SpecialCategoryRequest();
		request.setKey(config.getKey());
		request.setSpecialCategories(parameter.c1);
	}
}
