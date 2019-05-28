package com.example.spring.webapi.carsensor.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.carsensor.v1.request.PrefRequest;
import com.example.spring.webapi.carsensor.v1.responce.PrefResponse;

@Service
public class Pref
		extends ApiBase<PrefRequest, PrefResponse> {

	@Override
	protected Class<PrefResponse> type() {
		return PrefResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getCarcensor().getPrefecture();
	}
}
