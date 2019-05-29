package com.example.spring.webapi.abroad.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.abroad.v1.request.TourTallyRequest;
import com.example.spring.webapi.abroad.v1.responce.TourTallyResponse;

@Service
public class TourTally
		extends ApiBase<TourTallyRequest, TourTallyResponse> {

	@Override
	protected Class<TourTallyResponse> type() {

		return TourTallyResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getAbroad().getTourTally();
	}

}
