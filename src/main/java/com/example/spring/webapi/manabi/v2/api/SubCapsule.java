package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.manabi.v2.request.SubCapsuleRequest;
import com.example.spring.webapi.manabi.v2.response.SubCapsuleResponse;

@Service
public class SubCapsule
		extends ApiBase<SubCapsuleRequest, SubCapsuleResponse> {

	@Override
	protected Class<SubCapsuleResponse> type() {
		return SubCapsuleResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getSubCapsule();
	}
}
