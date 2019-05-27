package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.PrefectureRequest;
import com.example.spring.manabi.response.v2.PrefectureResponse;

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
