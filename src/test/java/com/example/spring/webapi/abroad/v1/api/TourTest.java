package com.example.spring.webapi.abroad.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.values.Order;
import com.example.spring.webapi.abroad.v1.request.TourRequest;
import com.example.spring.webapi.abroad.v1.responce.TourResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class TourTest
		extends ApiTest<Tour, TourRequest, TourResponse> {

	@Parameterized.Parameters
	public static List<TourRequest> data() {

		List<TourRequest> list = new ArrayList<>();
		list.add(TourRequest.of().ids($("AB123456")).build());
		list.add(TourRequest.of().areas($("EUR")).build());
		list.add(TourRequest.of().countries($("BE")).build());
		list.add(TourRequest.of().cities($("NYC")).build());
		list.add(TourRequest.of().hotels($("73393")).build());
		list.add(TourRequest.of().keywords($("ベトナム")).build());
		list.add(TourRequest.of().keywordsOr($("ベトナム")).build());
		list.add(TourRequest.of().themes($("73393")).build());
		list.add(TourRequest.of().themeGroups($("G00004")).build());
		list.add(TourRequest.of().ad_type("F").build());
		list.add(TourRequest.of().osusumes($("007")).build());
		list.add(TourRequest.of().keywords($("ベトナム")).depts($("NGO")).build());
		list.add(TourRequest.of().keywords($("ベトナム")).ym(201905).build());
		list.add(TourRequest.of().keywords($("ベトナム")).ymd(20190520).build());
		list.add(TourRequest.of().keywords($("ベトナム")).priceMax(100000).build());
		list.add(TourRequest.of().keywords($("ベトナム")).termMin(10).build());
		list.add(TourRequest.of().keywords($("ベトナム")).termMax(10).build());
		list.add(TourRequest.of().keywords($("ベトナム")).airlines($("AO")).build());
		for (int i = 1; i < 11; i++) {
			list.add(TourRequest.of().keywords($("ベトナム")).kodawaris($("" + i)).build());
		}
		for (Order order : Order.aproadValues()) {
			list.add(TourRequest.of().keywords($("ベトナム")).order(order).build());
		}
		list.add(TourRequest.of().keywords($("ベトナム")).kwic("1").build());
		for (int i = 1; i < 3; i++) {
			list.add(TourRequest.of().keywords($("ベトナム")).seatClasses($("" + i)).build());
		}

		return list;

	}

	final TourRequest parameter;

	@Autowired
	Tour api;

	@Override
	protected Tour api() {

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
