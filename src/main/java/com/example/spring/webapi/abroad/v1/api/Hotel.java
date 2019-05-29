package com.example.spring.webapi.abroad.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.abroad.v1.request.HotelRequest;
import com.example.spring.webapi.abroad.v1.responce.HotelResponse;

@Service
public class Hotel
		extends ApiBase<HotelRequest, HotelResponse> {

	@Override
	protected Class<HotelResponse> type() {

		return HotelResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getAbroad().getHotel();
	}

}
