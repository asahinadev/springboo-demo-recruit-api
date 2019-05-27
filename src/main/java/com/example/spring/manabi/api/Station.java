package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.StationRequest;
import com.example.spring.manabi.response.v2.StationResponse;

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
