package com.example.spring.webapi.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.hotpepper.v1.request.ServiceAreaRequest;
import com.example.spring.webapi.hotpepper.v1.responce.ServiceAreaResponse;

@Service
public class ServiceArea
		extends ApiBase<ServiceAreaRequest, ServiceAreaResponse> {

	@Override
	protected URI uri() {

		return config.getHotpepper().getServiceArea();
	}
}
