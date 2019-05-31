package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.manabi.v2.request.AreaRequest;
import com.example.spring.webapi.manabi.v2.response.AreaResponse;

@Service
public class Area
		extends ApiBase<AreaRequest, AreaResponse> {

	@Override
	protected URI uri() {

		return config.getManabi().getArea();
	}
}
