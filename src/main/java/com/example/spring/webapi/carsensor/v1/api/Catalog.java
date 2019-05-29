package com.example.spring.webapi.carsensor.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.carsensor.v1.request.CatalogRequest;
import com.example.spring.webapi.carsensor.v1.responce.CatalogResponse;

@Service
public class Catalog
		extends ApiBase<CatalogRequest, CatalogResponse> {

	@Override
	protected Class<CatalogResponse> type() {

		return CatalogResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getCarcensor().getCatalog();
	}
}
