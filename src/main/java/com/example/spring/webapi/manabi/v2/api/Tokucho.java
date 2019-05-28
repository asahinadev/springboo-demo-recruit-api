package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.manabi.v2.request.TokuchoRequest;
import com.example.spring.webapi.manabi.v2.response.TokuchoResponse;

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
