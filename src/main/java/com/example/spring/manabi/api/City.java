package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.CityRequest;
import com.example.spring.manabi.response.v2.CityResponse;

@Service
public class City
		extends ApiBase<CityRequest, CityResponse> {

	@Override
	protected Class<CityResponse> type() {
		return CityResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getCity();
	}
}
