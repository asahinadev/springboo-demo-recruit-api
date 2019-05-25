package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.hotpepper.request.v1.ServiceAreaRequest;
import com.example.spring.hotpepper.responce.v1.ServiceAreaResponse;
import com.example.spring.parts.ApiBase;

@Service
public class ServiceArea
		extends ApiBase<ServiceAreaRequest, ServiceAreaResponse> {

	@Override
	protected Class<ServiceAreaResponse> type() {
		return ServiceAreaResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getHotpepper().getServiceArea();
	}
}
