package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.manabi.v2.request.TsushinRequest;
import com.example.spring.webapi.manabi.v2.response.TsushinResponse;

@Service
public class Tsushin
		extends ApiBase<TsushinRequest, TsushinResponse> {

	@Override
	protected Class<TsushinResponse> type() {
		return TsushinResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getTsushin();
	}
}
