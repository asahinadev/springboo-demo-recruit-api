package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.TokuchoRequest;
import com.example.spring.manabi.response.v2.TokuchoResponse;

@Service
public class Tokucho
		extends ApiBase<TokuchoRequest, TokuchoResponse> {

	@Override
	protected Class<TokuchoResponse> type() {
		return TokuchoResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getTokucho();
	}
}
