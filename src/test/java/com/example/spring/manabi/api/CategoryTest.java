package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.manabi.request.v2.CategoryRequest;
import com.example.spring.manabi.response.v2.CategoryResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CategoryTest
		extends ApiTest<Category, CategoryRequest, CategoryResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter(1, $("G010001", "G010002")),
				new Parameter(2, $("J000001", "J000002")),
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	Category api;

	@Override
	protected Category api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new CategoryRequest();
		request.setKey(config.getKey());
		request.setCategories(parameter.c1);
		request.setGenres(parameter.c2);
	}
}
