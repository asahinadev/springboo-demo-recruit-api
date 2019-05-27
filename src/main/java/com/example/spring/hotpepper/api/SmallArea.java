package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.hotpepper.request.v1.SmallAreaRequest;
import com.example.spring.hotpepper.responce.v1.SmallAreaResponse;

@Service
public class SmallArea
		extends ApiBase<SmallAreaRequest, SmallAreaResponse> {

	@Override
	protected Class<SmallAreaResponse> type() {
		return SmallAreaResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getHotpepper().getSmallArea();
	}
}
