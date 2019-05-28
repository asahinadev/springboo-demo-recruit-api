package com.example.spring.hotpepper.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.hotpepper.request.v1.ServiceAreaRequest;
import com.example.spring.hotpepper.responce.v1.ServiceAreaResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ServiceAreaTest
		extends ApiTest<ServiceArea, ServiceAreaRequest, ServiceAreaResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(new Parameter());
	}

	final Parameter parameter;

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
		request = new ServiceAreaRequest();
		request.setKey(config.getKey());
	}

}
