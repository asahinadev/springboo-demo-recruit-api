package com.example.spring.webapi.manabi.v2.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.manabi.v2.api.Category;
import com.example.spring.webapi.manabi.v2.request.CategoryRequest;
import com.example.spring.webapi.manabi.v2.response.CategoryResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CategoryTest
		extends ApiTest<Category, CategoryRequest, CategoryResponse> {

	@Parameterized.Parameters
	public static List<CategoryRequest> data() {
		List<CategoryRequest> list = new ArrayList<>();
		// list.add(CategoryRequest.of().build());

		//		category (G010029)
		list.add(CategoryRequest.of().categories($("G010029")).build());
		//		genre (J000001)
		list.add(CategoryRequest.of().genres($("J000001")).build());

		return list;
	}

	final CategoryRequest parameter;

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
		request = parameter;
		request.setKey(config.getKey());
	}
}
