package com.example.spring.webapi.carsensor.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.carsensor.v1.request.BrandRequest;
import com.example.spring.webapi.carsensor.v1.responce.BrandResponse;

@Service
public class Brand
		extends ApiBase<BrandRequest, BrandResponse> {

	@Override
	protected URI uri() {

		return config.getCarcensor().getBrand();
	}
}
