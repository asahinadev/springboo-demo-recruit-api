package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.manabi.v2.request.StationRequest;
import com.example.spring.webapi.manabi.v2.response.StationResponse;

@Service
public class Station
		extends ApiBase<StationRequest, StationResponse> {

	@Override
	protected Class<StationResponse> type() {

		return StationResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getManabi().getStation();
	}
}
