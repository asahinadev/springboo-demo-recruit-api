package com.example.spring.webapi.manabi.v2.api;

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
import com.example.spring.webapi.manabi.v2.request.TsugakuRequest;
import com.example.spring.webapi.manabi.v2.response.TsugakuResponse;
import com.example.spring.webapi.manabi.v2.values.Term;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class TsugakuTest
		extends ApiTest<Tsugaku, TsugakuRequest, TsugakuResponse> {

	@Parameterized.Parameters
	public static List<TsugakuRequest> data() {

		List<TsugakuRequest> list = new ArrayList<>();
		// list.add(TsugakuRequest.of().build());

		//		code (0010517137)
		list.add(TsugakuRequest.of().codes($("0010517137")).build());
		//		school (H900068)
		list.add(TsugakuRequest.of().schools($("H900068")).build());
		//		kyoten (9400000073)
		list.add(TsugakuRequest.of().kyotens($("9400000073")).build());
		//		capsule_type (01 / 02 / 03)
		for (int i = 1; i <= 3; i++) {
			list.add(TsugakuRequest.of().prefectures($("13")).capsuleTypes($(String.format("%02d", i))).build());
		}
		//		category (G010029)
		list.add(TsugakuRequest.of().categories($("G010029")).build());
		//		capsule (G020373)
		list.add(TsugakuRequest.of().capsules($("G020373")).build());
		//		sub_capsule (SB90373)
		list.add(TsugakuRequest.of().subCapsules($("SB90373")).build());
		//		tokushu (T700001)
		list.add(TsugakuRequest.of().tokushus($("T700001")).build());
		//		area
		for (int i = 1; i <= 6; i++) {
			list.add(TsugakuRequest.of().areas($(String.format("N%d", i))).build());
		}
		//		prefecture
		for (int i = 1; i <= 47; i++) {
			list.add(TsugakuRequest.of().prefectures($(String.format("%02d", i))).build());
		}
		//		city
		for (int i = 1; i <= 23; i++) {
			list.add(TsugakuRequest.of().cities($(String.format("131%02d", i))).build());
		}
		//		other_city
		for (YesAny flag : YesAny.values()) {
			list.add(TsugakuRequest.of().prefectures($("13")).otherCity(flag).build());
		}
		//		along 6726
		list.add(TsugakuRequest.of().alongs($("6726")).build());
		//		station 6726340
		list.add(TsugakuRequest.of().stations($("6726340")).build());
		//		tel 079-247-7393
		list.add(TsugakuRequest.of().tels($("0792477393")).build());
		//		zip 671-0101
		list.add(TsugakuRequest.of().zips($("6710101")).build());
		//		wday
		for (Wday flag : Wday.values()) {
			list.add(TsugakuRequest.of().wday($(flag)).build());
		}
		//		start_time_period
		for (Range flag : Range.manabiStartTimeValues()) {
			list.add(TsugakuRequest.of().startTimePeriods($(flag)).build());
		}
		//		juko_price_range
		for (Range r : Range.manabiJukoPriceValues()) {
			list.add(TsugakuRequest.of().jukoPriceRange(Arrays.asList(r)).build());
		}
		//		term
		for (Term range : Term.values()) {
			list.add(TsugakuRequest.of().term($(range)).build());
		}
		list.add(TsugakuRequest.of().tokuchos($("01001")).build());
		//		lat/lng/range/order
		// 品川
		for (Range r : Range.manabiValues()) {
			list.add(TsugakuRequest.of().lat(35.609167D).lng(139.730167D).range(r).order(Order.MANABI_ORDER_2).build());
		}
		//		tokucho 01001
		//		keyword
		list.add(TsugakuRequest.of().areas($("N2")).keyword("ヒメジダイガク").build());
		//		keyword_or
		list.add(TsugakuRequest.of().areas($("N2")).keywordOr($("ヒメジダイガク")).build());
		//		shiryo
		for (YesAny flag : YesAny.values()) {
			list.add(TsugakuRequest.of().areas($("N2")).shiryo(flag).build());
		}
		//		order
		list.add(TsugakuRequest.of().areas($("N2")).order(Order.MANABI_ORDER_1).build());

		return list;
	}

	final TsugakuRequest parameter;

	@Autowired
	Tsugaku api;

	@Override
	protected Tsugaku api() {

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
