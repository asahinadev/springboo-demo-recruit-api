package com.example.spring.webapi.abroadair.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.abroadair.v1.request.AirlineRequest;
import com.example.spring.webapi.abroadair.v1.responce.AirlineResponse;

@Service
public class Airline
		extends ApiBase<AirlineRequest, AirlineResponse> {

	@Override
	protected Class<AirlineResponse> type() {

		return AirlineResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getAbroadair().getAirline();
	}

}
