package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.hotpepper.request.v1.MiddleAreaRequest;
import com.example.spring.hotpepper.responce.v1.MiddleAreaResponse;

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
