package com.example.spring.webapi.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.hotpepper.v1.request.GourmetRequest;
import com.example.spring.webapi.hotpepper.v1.responce.GourmetResponse;

@Service
public class Gourmet
		extends ApiBase<GourmetRequest, GourmetResponse> {

	@Override
	protected Class<GourmetResponse> type() {

		return GourmetResponse.class;
	}

	@Override
	protected URI uri() {

		return config.getHotpepper().getGourmet();
	}
}
