package com.example.spring.webapi.abroad.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.abroad.v1.request.SpotRequest;
import com.example.spring.webapi.abroad.v1.responce.SpotResponse;

@Service
public class Spot
		extends ApiBase<SpotRequest, SpotResponse> {

	@Override
	protected URI uri() {

		return config.getAbroad().getSpot();
	}

}
