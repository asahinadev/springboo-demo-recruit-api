package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.manabi.v2.request.CityRequest;
import com.example.spring.webapi.manabi.v2.response.CityResponse;

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
