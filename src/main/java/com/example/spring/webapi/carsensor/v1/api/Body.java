package com.example.spring.webapi.carsensor.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.carsensor.v1.request.BodyRequest;
import com.example.spring.webapi.carsensor.v1.responce.BodyResponse;

@Service
public class Body
		extends ApiBase<BodyRequest, BodyResponse> {

	@Override
	protected Class<BodyResponse> type() {

		return BodyResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getCarcensor().getBody();
	}
}
