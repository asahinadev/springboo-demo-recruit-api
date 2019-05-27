package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.TokushuRequest;
import com.example.spring.manabi.response.v2.TokushuResponse;

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
