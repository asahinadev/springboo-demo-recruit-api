package com.example.spring.webapi.abroadair.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.abroadair.v1.request.AreaRequest;
import com.example.spring.webapi.abroadair.v1.responce.AreaResponse;

@Service
public class Area
		extends ApiBase<AreaRequest, AreaResponse> {

	@Override
	protected Class<AreaResponse> type() {
		return AreaResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getAbroadair().getArea();
	}
}
