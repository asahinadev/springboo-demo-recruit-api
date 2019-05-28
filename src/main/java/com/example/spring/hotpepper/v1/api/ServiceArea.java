package com.example.spring.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.hotpepper.v1.request.ServiceAreaRequest;
import com.example.spring.hotpepper.v1.responce.ServiceAreaResponse;

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