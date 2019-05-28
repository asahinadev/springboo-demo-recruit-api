package com.example.spring.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.v2.request.AlongRequest;
import com.example.spring.manabi.v2.response.AlongResponse;

@Service
public class Along
		extends ApiBase<AlongRequest, AlongResponse> {

	@Override
	protected Class<AlongResponse> type() {
		return AlongResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getAlong();
	}
}
