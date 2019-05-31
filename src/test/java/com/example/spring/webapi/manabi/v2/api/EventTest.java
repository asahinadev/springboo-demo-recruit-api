package com.example.spring.webapi.manabi.v2.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.example.spring.common.values.Range;
import com.example.spring.common.values.Wday;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.manabi.v2.request.EventRequest;
import com.example.spring.webapi.manabi.v2.response.EventResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class EventTest
		extends ApiTest<Event, EventRequest, EventResponse> {

	@Parameterized.Parameters
	public static List<EventRequest> data() {

		List<EventRequest> list = new ArrayList<>();
		// list.add(EventRequest.of().build());

		//		code (0010517137)
		list.add(EventRequest.of().codes($("0010517137")).build());
		//		school (H900068)
		list.add(EventRequest.of().schools($("H900068")).build());
		//		kyoten (9400000073)
		list.add(EventRequest.of().kyotens($("9400000073")).build());
		//		capsule_type (01 / 02 / 03)
		for (int i = 1; i <= 3; i++) {
			list.add(EventRequest.of().prefectures($("13")).capsuleTypes($(String.format("%02d", i))).build());
		}
		//		category (G010029)
		list.add(EventRequest.of().categories($("G010029")).build());
		//		capsule (G020373)
		list.add(EventRequest.of().capsules($("G020373")).build());
		//		sub_capsule (SB90373)
		list.add(EventRequest.of().subCapsules($("SB90373")).build());
		//		tokushu (T700001)
		list.add(EventRequest.of().tokushus($("T700001")).build());
		//		area
		for (int i = 1; i <= 6; i++) {
			list.add(EventRequest.of().areas($(String.format("N%d", i))).build());
		}
		//		prefecture
		for (int i = 1; i <= 47; i++) {
			list.add(EventRequest.of().prefectures($(String.format("%02d", i))).build());
		}
		//		city
		for (int i = 1; i <= 23; i++) {
			list.add(EventRequest.of().cities($(String.format("131%02d", i))).build());
		}
		//		other_city
		for (YesAny flag : YesAny.values()) {
			list.add(EventRequest.of().prefectures($("13")).otherCity(flag).build());
		}
		//		along 6726
		list.add(EventRequest.of().alongs($("6726")).build());
		//		station 6726340
		list.add(EventRequest.of().stations($("6726340")).build());
		//		tel 079-247-7393
		list.add(EventRequest.of().tels($("0792477393")).build());
		//		zip 671-0101
		list.add(EventRequest.of().zips($("6710101")).build());
		//		tokucho 01001
		list.add(EventRequest.of().tokuchos($("01001")).build());
		//		lat/lng/range/order
		// 品川
		for (Range r : Range.manabiValues()) {
			list.add(EventRequest.of().lat(35.609167D).lng(139.730167D).range(r).order(Order.MANABI_ORDER_2).build());
		}
		//	start_time_from
		list.add(EventRequest.of().areas($("N2")).startTimeFrom("1200").build());
		//	start_time_to
		list.add(EventRequest.of().areas($("N2")).startTimeTo("1200").build());
		//		wday
		for (Wday flag : Wday.values()) {
			list.add(EventRequest.of().wday($(flag)).build());
		}
		//	date_from
		list.add(EventRequest.of().areas($("N2"))
				.dateFrom(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"))).build());
		//	date_to
		list.add(EventRequest.of().areas($("N2"))
				.dateTo(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"))).build());

		//		juko_price_range
		for (Range range : Range.manabiJukoPriceValues()) {
			list.add(EventRequest.of().jukoPriceRange(Arrays.asList(range)).build());
		}
		//		keyword
		list.add(EventRequest.of().areas($("N2")).keyword("ヒメジダイガク").build());
		//		keyword_or
		list.add(EventRequest.of().areas($("N2")).keywordOr($("ヒメジダイガク")).build());
		//	TODO reserve_type
		list.add(EventRequest.of().areas($("N2")).reserveType("01").build());
		list.add(EventRequest.of().areas($("N2")).reserveType("02").build());
		//	order
		list.add(EventRequest.of().areas($("N2")).order(Order.MANABI_ORDER_1).build());

		return list;

	}

	final EventRequest parameter;

	@Autowired
	Event api;

	@Override
	protected Event api() {

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
