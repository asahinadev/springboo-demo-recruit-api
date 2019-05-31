package com.example.spring.webapi.abroad.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import com.example.spring.ApiTest;
import com.example.spring.common.values.Order;
import com.example.spring.webapi.abroad.v1.request.CityRequest;
import com.example.spring.webapi.abroad.v1.responce.CityResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class CityTest
		extends ApiTest<City, CityRequest, CityResponse> {

	@Parameterized.Parameters
	public static List<CityRequest> data() {

		List<CityRequest> list = new ArrayList<>();

		list.add(CityRequest.of().build());
		list.add(CityRequest.of().areas($("EUR")).build());
		list.add(CityRequest.of().countries($("BE")).build());
		list.add(CityRequest.of().cities($("NY")).build());
		list.add(CityRequest.of().keywords($("ベトナム")).build());
		list.add(CityRequest.of().inUse("0").build());
		list.add(CityRequest.of().inUse("1").build());
		for (Order order : Order.aproadCityValues()) {
			list.add(CityRequest.of().order(order).build());

		}

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
