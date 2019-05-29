package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.manabi.v2.request.CapsuleTypeRequest;
import com.example.spring.webapi.manabi.v2.response.CapsuleTypeResponse;

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
