package com.example.spring.webapi.carsensor.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.carsensor.v1.request.CountryRequest;
import com.example.spring.webapi.carsensor.v1.responce.CountryResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CountryTest
		extends ApiTest<Country, CountryRequest, CountryResponse> {

	@Parameterized.Parameters
	public static List<CountryRequest> data() {

		List<CountryRequest> list = new ArrayList<>();

		list.add(CountryRequest.of().codes($("JPN")).build());
		list.add(CountryRequest.of().codes($("GER")).build());
		list.add(CountryRequest.of().codes($("USA")).build());

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
