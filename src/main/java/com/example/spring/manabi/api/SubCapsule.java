package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.SubCapsuleRequest;
import com.example.spring.manabi.response.v2.SubCapsuleResponse;

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
