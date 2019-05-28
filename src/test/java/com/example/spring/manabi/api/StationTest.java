package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.manabi.request.v2.StationRequest;
import com.example.spring.manabi.response.v2.StationResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class StationTest
		extends ApiTest<Station, StationRequest, StationResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter(1, $("9999", "8999")),
				new Parameter(2, $("9999", "8999")),
				new Parameter(3, $("9999", "8999")),
				new Parameter(4, $("9999", "8999")),
				new Parameter(5, $("9999", "8999")),
				new Parameter($("9999", "8999"), "両国"));
	}

	final Parameter parameter;

	@Autowired
	Station api;

	@Override
	protected Station api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new StationRequest();
		request.setKey(config.getKey());
		request.setStations(parameter.c2);
		request.setFacilities(parameter.c1);
		request.setAlongs(parameter.c3);
		request.setCities(parameter.c4);
		request.setPrefectures(parameter.c5);
		request.setKeyword(parameter.k);
	}
}
