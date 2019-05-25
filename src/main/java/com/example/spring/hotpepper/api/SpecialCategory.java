package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.hotpepper.parts.ApiBase;
import com.example.spring.hotpepper.request.v1.SpecialCategoryRequest;
import com.example.spring.hotpepper.responce.v1.SpecialCategoryResponse;

@Service
public class SpecialCategory
		extends ApiBase<SpecialCategoryRequest, SpecialCategoryResponse> {

	@Override
	protected Class<SpecialCategoryResponse> type() {
		return SpecialCategoryResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getHotpepper().getSpecialCategory();
	}
}
