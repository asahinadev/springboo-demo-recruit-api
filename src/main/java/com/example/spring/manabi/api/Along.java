package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.manabi.request.v2.AlongRequest;
import com.example.spring.manabi.response.v2.AlongResponse;
import com.example.spring.parts.ApiBase;

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
