package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.CapsuleTypeRequest;
import com.example.spring.manabi.response.v2.CapsuleTypeResponse;

@Service
public class CapsuleType
		extends ApiBase<CapsuleTypeRequest, CapsuleTypeResponse> {

	@Override
	protected Class<CapsuleTypeResponse> type() {
		return CapsuleTypeResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getCapsuleType();
	}
}
