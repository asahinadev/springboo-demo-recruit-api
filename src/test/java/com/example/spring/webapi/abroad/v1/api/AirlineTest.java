package com.example.spring.webapi.abroad.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.abroad.v1.request.AirlineRequest;
import com.example.spring.webapi.abroad.v1.responce.AirlineResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class AirlineTest
		extends ApiTest<Airline, AirlineRequest, AirlineResponse> {

	@Parameterized.Parameters
	public static List<AirlineRequest> data() {

		List<AirlineRequest> list = new ArrayList<>();
		list.add(AirlineRequest.of().build());
		list.add(AirlineRequest.of().keyword($("ベトナム")).build());
		list.add(AirlineRequest.of().airlines($("AO")).build());
		return list;

	}

	final AirlineRequest parameter;

	@Autowired
	Airline api;

	@Override
	protected Airline api() {

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
