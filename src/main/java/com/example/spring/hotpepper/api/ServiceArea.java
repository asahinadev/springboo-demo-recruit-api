package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.hotpepper.parts.ApiBase;
import com.example.spring.hotpepper.request.v1.ServiceAreaRequest;
import com.example.spring.hotpepper.responce.v1.ServiceAreaResponse;

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
