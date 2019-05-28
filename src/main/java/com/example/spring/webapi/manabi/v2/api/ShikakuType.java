package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.manabi.v2.request.ShikakuTypeRequest;
import com.example.spring.webapi.manabi.v2.response.ShikakuTypeResponse;

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
