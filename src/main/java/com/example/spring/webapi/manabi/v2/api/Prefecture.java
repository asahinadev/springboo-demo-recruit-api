package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.manabi.v2.request.PrefectureRequest;
import com.example.spring.webapi.manabi.v2.response.PrefectureResponse;

@Service
public class Prefecture
		extends ApiBase<PrefectureRequest, PrefectureResponse> {

	@Override
	protected URI uri() {

		return config.getManabi().getPrefecture();
	}
}
