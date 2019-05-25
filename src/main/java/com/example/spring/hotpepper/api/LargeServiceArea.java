package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.hotpepper.request.v1.LargeServiceAreaRequest;
import com.example.spring.hotpepper.responce.v1.LargeServiceAreaResponse;
import com.example.spring.parts.ApiBase;

@Service
public class LargeServiceArea
		extends ApiBase<LargeServiceAreaRequest, LargeServiceAreaResponse> {

	@Override
	protected Class<LargeServiceAreaResponse> type() {
		return LargeServiceAreaResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getHotpepper().getLargeServiceArea();
	}
}
