package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.manabi.v2.request.PrefectureRequest;
import com.example.spring.webapi.manabi.v2.response.PrefectureResponse;

@Service
public class Prefecture
		extends ApiBase<PrefectureRequest, PrefectureResponse> {

	@Override
	protected Class<PrefectureResponse> type() {

		return PrefectureResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getManabi().getPrefecture();
	}
}
