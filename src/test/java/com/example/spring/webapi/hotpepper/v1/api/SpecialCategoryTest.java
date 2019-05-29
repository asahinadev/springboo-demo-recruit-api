package com.example.spring.webapi.hotpepper.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.hotpepper.v1.request.SpecialCategoryRequest;
import com.example.spring.webapi.hotpepper.v1.responce.SpecialCategoryResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SpecialCategoryTest
		extends ApiTest<SpecialCategory, SpecialCategoryRequest, SpecialCategoryResponse> {

	@Parameterized.Parameters
	public static List<SpecialCategoryRequest> data() {

		List<SpecialCategoryRequest> list = new ArrayList<>();
		list.add(SpecialCategoryRequest.of().specialCategories($("SPA9")).build());
		list.add(SpecialCategoryRequest.of().build());
		return list;
	}

	final SpecialCategoryRequest parameter;

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

		request = parameter;
		request.setKey(config.getKey());
	}
}
