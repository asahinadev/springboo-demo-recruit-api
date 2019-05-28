package com.example.spring.webapi.carsensor.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.carsensor.v1.request.ColorRequest;
import com.example.spring.webapi.carsensor.v1.responce.ColorResponse;

@Service
public class Color
		extends ApiBase<ColorRequest, ColorResponse> {

	@Override
	protected Class<ColorResponse> type() {
		return ColorResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getCarcensor().getColor();
	}
}
