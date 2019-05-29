package com.example.spring.webapi.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.hotpepper.v1.request.SpecialRequest;
import com.example.spring.webapi.hotpepper.v1.responce.SpecialResponse;

@Service
public class Special
		extends ApiBase<SpecialRequest, SpecialResponse> {

	@Override
	protected Class<SpecialResponse> type() {

		return SpecialResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getHotpepper().getSpecial();
	}
}
