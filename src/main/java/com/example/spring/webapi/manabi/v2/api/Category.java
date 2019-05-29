package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.manabi.v2.request.CategoryRequest;
import com.example.spring.webapi.manabi.v2.response.CategoryResponse;

@Service
public class Category
		extends ApiBase<CategoryRequest, CategoryResponse> {

	@Override
	protected Class<CategoryResponse> type() {

		return CategoryResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getManabi().getCategory();
	}
}
