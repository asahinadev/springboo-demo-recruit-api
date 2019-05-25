package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.hotpepper.request.v1.GourmetRequest;
import com.example.spring.hotpepper.responce.v1.GourmetResponse;
import com.example.spring.parts.ApiBase;

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
