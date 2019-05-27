package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.SchoolRequest;
import com.example.spring.manabi.response.v2.SchoolResponse;

@Service
public class School
		extends ApiBase<SchoolRequest, SchoolResponse> {

	@Override
	protected Class<SchoolResponse> type() {
		return SchoolResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getSchoolKyoten();
	}
}
