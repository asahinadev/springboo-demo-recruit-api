package com.example.spring.webapi.manabi.v2.api;

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
import com.example.spring.common.values.YesNo;
import com.example.spring.webapi.manabi.v2.api.City;
import com.example.spring.webapi.manabi.v2.request.CityRequest;
import com.example.spring.webapi.manabi.v2.response.CityResponse;

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
		// list.add(CityRequest.of().build());

		//		area
		for (int i = 1; i <= 6; i++) {
			list.add(CityRequest.of().areas($(String.format("N%d", i))).build());
		}
		//		prefecture
		for (int i = 1; i <= 47; i++) {
			list.add(CityRequest.of().prefectures($(String.format("%02d", i))).build());
		}
		//		city
		for (int i = 1; i <= 23; i++) {
			list.add(CityRequest.of().cities($(String.format("131%02d", i))).build());
		}

		list.add(CityRequest.of().keyword("品川").mapDisp(YesNo.YES).build());
		list.add(CityRequest.of().keyword("品川").mapDisp(YesNo.NO).build());
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
