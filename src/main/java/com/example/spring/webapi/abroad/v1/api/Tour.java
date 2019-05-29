package com.example.spring.webapi.abroad.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.abroad.v1.request.TourRequest;
import com.example.spring.webapi.abroad.v1.responce.TourResponse;

@Service
public class Tour
		extends ApiBase<TourRequest, TourResponse> {

	@Override
	protected Class<TourResponse> type() {

		return TourResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getAbroad().getTour();
	}

}
