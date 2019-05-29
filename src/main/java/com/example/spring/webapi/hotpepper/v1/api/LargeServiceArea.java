package com.example.spring.webapi.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.hotpepper.v1.request.LargeServiceAreaRequest;
import com.example.spring.webapi.hotpepper.v1.responce.LargeServiceAreaResponse;

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
