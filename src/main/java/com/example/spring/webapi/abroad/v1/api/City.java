package com.example.spring.webapi.abroad.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.abroad.v1.request.CityRequest;
import com.example.spring.webapi.abroad.v1.responce.CityResponse;

@Service
public class City
		extends ApiBase<CityRequest, CityResponse> {

	@Override
	protected URI uri() {

		return config.getAbroad().getCity();
	}

}
