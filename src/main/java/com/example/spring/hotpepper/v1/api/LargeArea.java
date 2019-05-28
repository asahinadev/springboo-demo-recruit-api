package com.example.spring.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.hotpepper.v1.request.LargeAreaRequest;
import com.example.spring.hotpepper.v1.responce.LargeAreaResponse;

@Service
public class LargeArea
		extends ApiBase<LargeAreaRequest, LargeAreaResponse> {

	@Override
	protected Class<LargeAreaResponse> type() {
		return LargeAreaResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getHotpepper().getLargeArea();
	}
}
