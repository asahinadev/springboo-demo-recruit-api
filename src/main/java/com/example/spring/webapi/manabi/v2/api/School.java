package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.manabi.v2.request.SchoolRequest;
import com.example.spring.webapi.manabi.v2.response.SchoolResponse;

@Service
public class School
		extends ApiBase<SchoolRequest, SchoolResponse> {

	@Override
	protected URI uri() {

		return config.getManabi().getSchoolKyoten();
	}
}
