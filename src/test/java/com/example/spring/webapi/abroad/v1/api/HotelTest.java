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
import com.example.spring.webapi.abroad.v1.request.HotelRequest;
import com.example.spring.webapi.abroad.v1.responce.HotelResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class HotelTest
		extends ApiTest<Hotel, HotelRequest, HotelResponse> {

	@Parameterized.Parameters
	public static List<HotelRequest> data() {

		List<HotelRequest> list = new ArrayList<>();

		list.add(HotelRequest.of().areas($("EUR")).build());
		list.add(HotelRequest.of().countries($("BE")).build());
		list.add(HotelRequest.of().cities($("NY")).build());
		list.add(HotelRequest.of().hotels($("73393")).build());
		list.add(HotelRequest.of().keywords($("ベトナム")).build());
		list.add(HotelRequest.of().areas($("EUR")).inUse("0").build());
		list.add(HotelRequest.of().areas($("EUR")).inUse("1").build());
		for (Order order : Order.aproadHotelValues()) {
			list.add(HotelRequest.of().areas($("EUR")).order(order).build());

		}

		return list;

	}

	final HotelRequest parameter;

	@Autowired
	Hotel api;

	@Override
	protected Hotel api() {

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
