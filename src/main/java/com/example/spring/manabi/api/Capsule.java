package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.CapsuleRequest;
import com.example.spring.manabi.response.v2.CapsuleResponse;

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
