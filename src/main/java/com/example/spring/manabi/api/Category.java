package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.CategoryRequest;
import com.example.spring.manabi.response.v2.CategoryResponse;

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
