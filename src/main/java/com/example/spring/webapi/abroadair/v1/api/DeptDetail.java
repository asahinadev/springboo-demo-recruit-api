package com.example.spring.webapi.abroadair.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.abroadair.v1.request.DeptDetailRequest;
import com.example.spring.webapi.abroadair.v1.responce.DeptDetailResponse;

@Service
public class DeptDetail
		extends ApiBase<DeptDetailRequest, DeptDetailResponse> {

	@Override
	protected Class<DeptDetailResponse> type() {
		return DeptDetailResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getAbroadair().getDeptDetail();
	}
}
