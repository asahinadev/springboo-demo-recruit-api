package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.hotpepper.request.v1.LargeAreaRequest;
import com.example.spring.hotpepper.responce.v1.LargeAreaResponse;

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
