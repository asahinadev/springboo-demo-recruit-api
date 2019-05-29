package com.example.spring.webapi.abroad.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.abroad.v1.request.CountryRequest;
import com.example.spring.webapi.abroad.v1.responce.CountryResponse;

@Service
public class Country
		extends ApiBase<CountryRequest, CountryResponse> {

	@Override
	protected Class<CountryResponse> type() {

		return CountryResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getAbroad().getCountry();
	}

}