package com.example.spring.webapi.abroadair.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.values.Order;
import com.example.spring.webapi.abroadair.v1.request.CountryRequest;
import com.example.spring.webapi.abroadair.v1.responce.CountryResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CountryTest
		extends ApiTest<Country, CountryRequest, CountryResponse> {

	@Parameterized.Parameters
	public static List<CountryRequest> data() {

		List<CountryRequest> list = new ArrayList<>();

		list.add(CountryRequest.of().areas($("EUR")).build());
		list.add(CountryRequest.of().countries($("BE")).build());
		list.add(CountryRequest.of().keyword($("ベトナム")).build());
		list.add(CountryRequest.of().inUse("0").build());
		list.add(CountryRequest.of().inUse("1").build());
		for (Order order : Order.aproadaireCityValues()) {
			list.add(CountryRequest.of().order(order).build());

		}

		list.add(CountryRequest.of().build());
		return list;

	}

	final CountryRequest parameter;

	@Autowired
	Country api;

	@Override
	protected Country api() {
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
