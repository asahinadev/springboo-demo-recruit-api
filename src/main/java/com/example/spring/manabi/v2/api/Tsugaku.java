package com.example.spring.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.v2.request.TsugakuRequest;
import com.example.spring.manabi.v2.response.TsugakuResponse;

@Service
public class Tsugaku
		extends ApiBase<TsugakuRequest, TsugakuResponse> {

	@Override
	protected Class<TsugakuResponse> type() {
		return TsugakuResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getKouza();
	}
}
