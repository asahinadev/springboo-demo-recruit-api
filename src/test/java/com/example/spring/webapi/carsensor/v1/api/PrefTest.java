package com.example.spring.webapi.carsensor.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.carsensor.v1.request.PrefRequest;
import com.example.spring.webapi.carsensor.v1.responce.PrefResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class PrefTest
		extends ApiTest<Pref, PrefRequest, PrefResponse> {

	@Parameterized.Parameters
	public static List<PrefRequest> data() {

		List<PrefRequest> list = new ArrayList<>();

		for (int i = 1; i <= 47; i++) {
			list.add(PrefRequest.of().codes($(String.format("%02d", i))).build());
		}

		for (int i = 1; i <= 9; i++) {
			list.add(PrefRequest.of().largeAreas($(String.format("%d", i))).build());
		}

		list.add(PrefRequest.of().build());
		return list;
	}

	final PrefRequest parameter;

	@Autowired
	Pref api;

	@Override
	protected Pref api() {

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
