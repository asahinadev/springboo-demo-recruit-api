package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.manabi.v2.request.AlongRequest;
import com.example.spring.webapi.manabi.v2.response.AlongResponse;

@Service
public class Along
		extends ApiBase<AlongRequest, AlongResponse> {

	@Override
	protected URI uri() {

		return config.getManabi().getAlong();
	}
}
