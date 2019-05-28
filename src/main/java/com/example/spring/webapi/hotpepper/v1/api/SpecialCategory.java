package com.example.spring.webapi.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.hotpepper.v1.request.SpecialCategoryRequest;
import com.example.spring.webapi.hotpepper.v1.responce.SpecialCategoryResponse;

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
