package com.example.spring.webapi.abroadair.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.values.Order;
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

		list.add(CityRequest.of().areas($("EUR")).build());
		list.add(CityRequest.of().countries($("BE")).build());
		list.add(CityRequest.of().cities($("NY")).build());
		list.add(CityRequest.of().tourCities($("NYC")).build());
		list.add(CityRequest.of().zones($("BC2")).build());
		list.add(CityRequest.of().keyword($("ベトナム")).build());
		list.add(CityRequest.of().inUse("0").build());
		list.add(CityRequest.of().inUse("1").build());
		for (Order order : Order.aproadaireCityValues()) {
			list.add(CityRequest.of().order(order).build());

		}

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
