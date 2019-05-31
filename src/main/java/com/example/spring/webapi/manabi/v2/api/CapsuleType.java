package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.manabi.v2.request.CapsuleTypeRequest;
import com.example.spring.webapi.manabi.v2.response.CapsuleTypeResponse;

@Service
public class CapsuleType
		extends ApiBase<CapsuleTypeRequest, CapsuleTypeResponse> {

	@Override
	protected URI uri() {

		return config.getManabi().getCapsuleType();
	}
}
