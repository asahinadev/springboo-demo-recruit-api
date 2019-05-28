package com.example.spring.webapi.abroadair.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.abroadair.v1.request.CityRequest;
import com.example.spring.webapi.abroadair.v1.responce.CityResponse;

@Service
public class City
		extends ApiBase<CityRequest, CityResponse> {

	@Override
	protected Class<CityResponse> type() {
		return CityResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getAbroadair().getCity();
	}
}
