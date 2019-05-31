package com.example.spring.webapi.carsensor.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.values.Datum;
import com.example.spring.common.values.Order;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.carsensor.v1.request.UsedcarRequest;
import com.example.spring.webapi.carsensor.v1.responce.UsedcarResponse;
import com.example.spring.webapi.carsensor.v1.values.Mission;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class UsedcarTest
		extends ApiTest<Usedcar, UsedcarRequest, UsedcarResponse> {

	@Parameterized.Parameters
	public static List<UsedcarRequest> data() {

		List<UsedcarRequest> list = new ArrayList<>();

		list.add(UsedcarRequest.of().ids($("999999999999999999")).build());

		list.add(UsedcarRequest.of().brands($("TO")).build());
		list.add(UsedcarRequest.of().brands($("MA")).build());
		list.add(UsedcarRequest.of().brands($("NI")).build());
		list.add(UsedcarRequest.of().brands($("HO")).build());
		list.add(UsedcarRequest.of().brands($("SB")).build());
		list.add(UsedcarRequest.of().brands($("SZ")).build());
		list.add(UsedcarRequest.of().brands($("MI")).build());
		list.add(UsedcarRequest.of().brands($("DA")).build());

		list.add(UsedcarRequest.of().model("インプレッサ").build());
		list.add(UsedcarRequest.of().model("スカイライン").build());

		list.add(UsedcarRequest.of().countries($("JPN")).build());
		list.add(UsedcarRequest.of().countries($("GER")).build());
		list.add(UsedcarRequest.of().countries($("USA")).build());

		for (int i = 1; i <= 9; i++) {
			list.add(UsedcarRequest.of().largeAreas($(String.format("%d", i))).build());
		}

		for (int i = 1; i <= 47; i++) {
			list.add(UsedcarRequest.of().prefs($(String.format("%02d", i))).build());
		}

		list.add(UsedcarRequest.of().bodies($("S")).build());

		list.add(UsedcarRequest.of().person(5).build());

		list.add(UsedcarRequest.of().colors($("WT")).build());

		list.add(UsedcarRequest.of().person(5).priceMin(500000).build());
		list.add(UsedcarRequest.of().person(5).priceMax(500000).build());

		list.add(UsedcarRequest.of().keyword("GT").build());

		//		lat/lng/range/order
		// 品川
		for (Order order : Order.carcensorUsedValues()) {
			list.add(UsedcarRequest.of().lat(35.609167D).lng(139.730167D).range(200).order(order).build());
		}

		for (Datum datum : Datum.values()) {
			list.add(UsedcarRequest.of().lat(35.609167D).lng(139.730167D).range(200).datum(datum).build());
		}

		for (Mission mission : Mission.values()) {
			list.add(UsedcarRequest.of().lat(35.609167D).lng(139.730167D).range(200).mission(mission).build());
		}

		for (YesAny any : YesAny.values()) {
			list.add(UsedcarRequest.of().keyword("GT").nonsmoking(any).build());
			list.add(UsedcarRequest.of().keyword("GT").leather(any).build());
			list.add(UsedcarRequest.of().keyword("GT").welfare(any).build());
		}

		list.add(UsedcarRequest.of().person(5).yearOld(2000).build());
		list.add(UsedcarRequest.of().person(5).yearNew(2000).build());

		list.add(UsedcarRequest.of().person(5).oddMin(500000).build());
		list.add(UsedcarRequest.of().person(5).oddMax(500000).build());

		for (Order any : Order.carcensorUsedValues()) {
			list.add(UsedcarRequest.of().person(5).order(any).build());
		}

		return list;
	}

	final UsedcarRequest parameter;

	@Autowired
	Usedcar api;

	@Override
	protected Usedcar api() {

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
