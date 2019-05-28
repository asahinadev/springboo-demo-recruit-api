package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.manabi.v2.request.CapsuleRequest;
import com.example.spring.webapi.manabi.v2.response.CapsuleResponse;

@Service
public class Capsule
		extends ApiBase<CapsuleRequest, CapsuleResponse> {

	@Override
	protected Class<CapsuleResponse> type() {
		return CapsuleResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getCapsule();
	}
}
