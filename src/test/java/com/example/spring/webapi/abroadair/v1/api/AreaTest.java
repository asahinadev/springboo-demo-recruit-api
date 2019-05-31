package com.example.spring.webapi.abroadair.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.abroadair.v1.request.AreaRequest;
import com.example.spring.webapi.abroadair.v1.responce.AreaResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class AreaTest
		extends ApiTest<Area, AreaRequest, AreaResponse> {

	@Parameterized.Parameters
	public static List<AreaRequest> data() {

		List<AreaRequest> list = new ArrayList<>();
		list.add(AreaRequest.of().build());
		return list;

	}

	final AreaRequest parameter;

	@Autowired
	Area api;

	@Override
	protected Area api() {

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
