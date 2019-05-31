package com.example.spring.webapi.manabi.v2.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.values.Order;
import com.example.spring.common.values.Range;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.manabi.v2.request.TsushinRequest;
import com.example.spring.webapi.manabi.v2.response.TsushinResponse;
import com.example.spring.webapi.manabi.v2.values.Term;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class TsushinTest
		extends ApiTest<Tsushin, TsushinRequest, TsushinResponse> {

	@Parameterized.Parameters
	public static List<TsushinRequest> data() {

		List<TsushinRequest> list = new ArrayList<>();
		// list.add(TsushinRequest.of().build());

		//		code (9500000409)
		list.add(TsushinRequest.of().codes($("9500000409")).build());
		//		school (H900068)
		list.add(TsushinRequest.of().schools($("H900068")).build());
		//		kyoten (9400000073)
		list.add(TsushinRequest.of().kyotens($("9400000073")).build());
		//		capsule_type (01 / 02 / 03)
		for (int i = 1; i <= 3; i++) {
			list.add(TsushinRequest.of().prefectures($("13")).capsuleTypes($(String.format("%02d", i))).build());
		}
		//		category (G010029)
		list.add(TsushinRequest.of().categories($("G010029")).build());
		//		capsule (G020373)
		list.add(TsushinRequest.of().capsules($("G020373")).build());
		//		sub_capsule (SB90373)
		list.add(TsushinRequest.of().subCapsules($("SB90373")).build());
		//		tokushu (T700001)
		list.add(TsushinRequest.of().tokushus($("T700001")).build());
		//		area
		for (int i = 1; i <= 6; i++) {
			list.add(TsushinRequest.of().areas($(String.format("N%d", i))).build());
		}
		//		prefecture
		for (int i = 1; i <= 47; i++) {
			list.add(TsushinRequest.of().prefectures($(String.format("%02d", i))).build());
		}
		//		city
		for (int i = 1; i <= 23; i++) {
			list.add(TsushinRequest.of().cities($(String.format("131%02d", i))).build());
		}
		//		other_city
		for (YesAny flag : YesAny.values()) {
			list.add(TsushinRequest.of().prefectures($("13")).otherCity(flag).build());
		}
		//		along 6726
		list.add(TsushinRequest.of().alongs($("6726")).build());
		//		station 6726340
		list.add(TsushinRequest.of().stations($("6726340")).build());
		//		tel 079-247-7393
		list.add(TsushinRequest.of().tels($("0792477393")).build());
		//		zip 671-0101
		list.add(TsushinRequest.of().zips($("6710101")).build());
		//		juko_price_range
		for (Range r : Range.manabiJukoPriceValues()) {
			list.add(TsushinRequest.of().jukoPriceRange(Arrays.asList(r)).build());
		}
		//		term
		for (Term range : Term.values()) {
			list.add(TsushinRequest.of().term($(range)).build());
		}
		//		tokucho 01001
		list.add(TsushinRequest.of().tokuchos($("01001")).build());
		//		lat/lng/range/order
		// 品川
		for (Range r : Range.manabiValues()) {
			list.add(TsushinRequest.of().lat(35.609167D).lng(139.730167D).range(r).order(Order.MANABI_ORDER_2).build());
		}
		//		keyword
		list.add(TsushinRequest.of().areas($("N2")).keyword("ヒメジダイガク").build());
		//		keyword_or
		list.add(TsushinRequest.of().areas($("N2")).keywordOr($("ヒメジダイガク")).build());
		//		shiryo
		for (YesAny flag : YesAny.values()) {
			list.add(TsushinRequest.of().areas($("N2")).shiryo(flag).build());
		}
		//		order
		list.add(TsushinRequest.of().areas($("N2")).order(Order.MANABI_ORDER_1).build());

		return list;
	}

	final TsushinRequest parameter;

	@Autowired
	Tsushin api;

	@Override
	protected Tsushin api() {

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
