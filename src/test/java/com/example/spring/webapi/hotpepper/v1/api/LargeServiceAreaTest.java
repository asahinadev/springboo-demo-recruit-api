package com.example.spring.webapi.hotpepper.v1.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.webapi.hotpepper.v1.api.LargeServiceArea;
import com.example.spring.webapi.hotpepper.v1.request.LargeServiceAreaRequest;
import com.example.spring.webapi.hotpepper.v1.responce.LargeServiceAreaResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class LargeServiceAreaTest
		extends ApiTest<LargeServiceArea, LargeServiceAreaRequest, LargeServiceAreaResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(new Parameter());
	}

	final Parameter parameter;

	@Autowired
	LargeServiceArea api;

	@Override
	protected LargeServiceArea api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new LargeServiceAreaRequest();
		request.setKey(config.getKey());
	}

}
