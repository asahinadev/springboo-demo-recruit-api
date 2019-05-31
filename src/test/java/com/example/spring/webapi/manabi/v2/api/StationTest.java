package com.example.spring.webapi.manabi.v2.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.manabi.v2.api.Station;
import com.example.spring.webapi.manabi.v2.request.StationRequest;
import com.example.spring.webapi.manabi.v2.response.StationResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class StationTest
		extends ApiTest<Station, StationRequest, StationResponse> {

	@Parameterized.Parameters
	public static List<StationRequest> data() {

		List<StationRequest> list = new ArrayList<>();
		//		station 6726340
		list.add(StationRequest.of().stations($("6726340")).build());
		//		facility 1043
		list.add(StationRequest.of().facilities($("1043")).build());
		//		along 6726
		list.add(StationRequest.of().alongs($("6726")).build());
		//		prefecture
		for (int i = 1; i <= 47; i++) {
			list.add(StationRequest.of().prefectures($(String.format("%02d", i))).build());
		}
		//		city
		for (int i = 1; i <= 23; i++) {
			list.add(StationRequest.of().cities($(String.format("131%02d", i))).build());
		}
		return list;

	}

	final StationRequest parameter;

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

		request = parameter;
		request.setKey(config.getKey());
	}
}
