package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.TsushinRequest;
import com.example.spring.manabi.response.v2.TsushinResponse;

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
