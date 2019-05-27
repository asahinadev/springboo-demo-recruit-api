package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.AreaRequest;
import com.example.spring.manabi.response.v2.AreaResponse;

@Service
public class Area
		extends ApiBase<AreaRequest, AreaResponse> {

	@Override
	protected Class<AreaResponse> type() {
		return AreaResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getArea();
	}
}
