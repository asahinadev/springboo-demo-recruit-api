package com.example.spring.webapi.abroadair.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.abroadair.v1.request.CityRequest;
import com.example.spring.webapi.abroadair.v1.responce.CityResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CityTest
		extends ApiTest<City, CityRequest, CityResponse> {

	@Parameterized.Parameters
	public static List<CityRequest> data() {

		List<CityRequest> list = new ArrayList<>();
		list.add(CityRequest.of().build());
		return list;

	}

	final CityRequest parameter;

	@Autowired
	City api;

	@Override
	protected City api() {
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
