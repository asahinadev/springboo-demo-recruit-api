package com.example.spring.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.hotpepper.v1.request.MiddleAreaRequest;
import com.example.spring.hotpepper.v1.responce.MiddleAreaResponse;

@Service
public class MiddleArea
		extends ApiBase<MiddleAreaRequest, MiddleAreaResponse> {

	@Override
	protected Class<MiddleAreaResponse> type() {
		return MiddleAreaResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getHotpepper().getMiddleArea();
	}
}
