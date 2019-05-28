package com.example.spring.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.v2.request.TokushuRequest;
import com.example.spring.manabi.v2.response.TokushuResponse;

@Service
public class Tokushu
		extends ApiBase<TokushuRequest, TokushuResponse> {

	@Override
	protected Class<TokushuResponse> type() {
		return TokushuResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getTokushu();
	}
}