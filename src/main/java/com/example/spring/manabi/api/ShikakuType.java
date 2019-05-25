package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.manabi.request.v2.ShikakuTypeRequest;
import com.example.spring.manabi.response.v2.ShikakuTypeResponse;
import com.example.spring.parts.ApiBase;

@Service
public class ShikakuType
		extends ApiBase<ShikakuTypeRequest, ShikakuTypeResponse> {

	@Override
	protected Class<ShikakuTypeResponse> type() {
		return ShikakuTypeResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getShikakuType();
	}
}
