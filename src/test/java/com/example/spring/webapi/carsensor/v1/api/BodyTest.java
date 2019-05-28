package com.example.spring.webapi.carsensor.v1.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.carsensor.v1.request.BodyRequest;
import com.example.spring.webapi.carsensor.v1.responce.BodyResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class BodyTest
		extends ApiTest<Body, BodyRequest, BodyResponse> {

	@Parameterized.Parameters
	public static List<BodyRequest> data() {
		return Arrays.asList(
				BodyRequest.of().build());
	}

	final BodyRequest parameter;

	@Autowired
	Body api;

	@Override
	protected Body api() {
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