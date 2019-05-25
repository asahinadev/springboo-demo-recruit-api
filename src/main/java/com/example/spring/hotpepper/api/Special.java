package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.hotpepper.request.v1.SpecialRequest;
import com.example.spring.hotpepper.responce.v1.SpecialResponse;
import com.example.spring.parts.ApiBase;

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
