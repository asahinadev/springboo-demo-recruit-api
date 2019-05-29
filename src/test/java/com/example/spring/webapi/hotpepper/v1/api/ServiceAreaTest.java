package com.example.spring.webapi.hotpepper.v1.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.hotpepper.v1.request.ServiceAreaRequest;
import com.example.spring.webapi.hotpepper.v1.responce.ServiceAreaResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ServiceAreaTest
		extends ApiTest<ServiceArea, ServiceAreaRequest, ServiceAreaResponse> {

	@Parameterized.Parameters
	public static List<ServiceAreaRequest> data() {

		return Arrays.asList(
				ServiceAreaRequest.of().build());
	}

	final ServiceAreaRequest parameter;

	@Autowired
	ServiceArea api;

	@Override
	protected ServiceArea api() {

		return api;
	}

	@Override
	protected Logger logger() {

		return log;
	}

	@Override
	protected void setParameter() {

		request = parameter;
		request.setKey(config.getKey());
	}

}
