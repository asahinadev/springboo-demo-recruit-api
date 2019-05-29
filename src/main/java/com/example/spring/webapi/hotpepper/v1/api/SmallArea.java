package com.example.spring.webapi.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.hotpepper.v1.request.SmallAreaRequest;
import com.example.spring.webapi.hotpepper.v1.responce.SmallAreaResponse;

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
