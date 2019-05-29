package com.example.spring.webapi.abroad.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.values.Order;
import com.example.spring.webapi.abroad.v1.request.TourTallyRequest;
import com.example.spring.webapi.abroad.v1.responce.TourTallyResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class TourTallyTest
		extends ApiTest<TourTally, TourTallyRequest, TourTallyResponse> {

	@Parameterized.Parameters
	public static List<TourTallyRequest> data() {

		List<TourTallyRequest> list = new ArrayList<>();
		list.add(TourTallyRequest.of().keywords($("ベトナム")).build());
		list.add(TourTallyRequest.of().keywords($("ベトナム")).depts($("NGO")).build());
		list.add(TourTallyRequest.of().keywords($("ベトナム")).ym(201905).build());
		list.add(TourTallyRequest.of().keywords($("ベトナム")).ymd(20190520).build());
		list.add(TourTallyRequest.of().keywords($("ベトナム")).priceMax(100000).build());
		list.add(TourTallyRequest.of().keywords($("ベトナム")).termMin(10).build());
		list.add(TourTallyRequest.of().keywords($("ベトナム")).termMax(10).build());
		list.add(TourTallyRequest.of().keywords($("ベトナム")).airlines($("AO")).build());
		for (int i = 1; i < 11; i++) {
			list.add(TourTallyRequest.of().keywords($("ベトナム")).kodawaris($("" + i)).build());
		}
		list.add(TourTallyRequest.of().keywords($("ベトナム")).axis("city").build());
		list.add(TourTallyRequest.of().keywords($("ベトナム")).axis("country").build());
		list.add(TourTallyRequest.of().keywords($("ベトナム")).axis("area").build());
		for (Order order : Order.aproadTallyValues()) {
			list.add(TourTallyRequest.of().keywords($("ベトナム")).order(order).build());
		}

		return list;

	}

	final TourTallyRequest parameter;

	@Autowired
	TourTally api;

	@Override
	protected TourTally api() {

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
