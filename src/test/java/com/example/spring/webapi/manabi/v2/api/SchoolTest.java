package com.example.spring.webapi.manabi.v2.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.values.Order;
import com.example.spring.common.values.Range;
import com.example.spring.common.values.Wday;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.manabi.v2.request.SchoolRequest;
import com.example.spring.webapi.manabi.v2.response.SchoolResponse;
import com.example.spring.webapi.manabi.v2.values.KyotenType;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SchoolTest
		extends ApiTest<School, SchoolRequest, SchoolResponse> {

	@Parameterized.Parameters
	public static List<SchoolRequest> data() {
		List<SchoolRequest> list = new ArrayList<>();
		// list.add(SchoolRequest.of().build());

		//		kyoten_type
		for (KyotenType type : KyotenType.values()) {
			list.add(SchoolRequest.of().prefectures($("13")).kyotenType(type).build());
		}
		//		school (H900068)
		list.add(SchoolRequest.of().schools($("H900068")).build());
		//		kyoten (9400000073)
		list.add(SchoolRequest.of().kyotens($("9400000073")).build());
		//		capsule_type (01 / 02 / 03)
		for (int i = 1; i <= 3; i++) {
			list.add(SchoolRequest.of().prefectures($("13")).capsuleTypes($(String.format("%02d", i))).build());
		}
		//		category (G010029)
		list.add(SchoolRequest.of().categories($("G010029")).build());
		//		capsule (G020373)
		list.add(SchoolRequest.of().capsules($("G020373")).build());
		//		sub_capsule (SB90373)
		list.add(SchoolRequest.of().subCapsules($("SB90373")).build());
		//		tokushu (T700001)
		list.add(SchoolRequest.of().tokushus($("T700001")).build());
		//		area
		for (int i = 1; i <= 6; i++) {
			list.add(SchoolRequest.of().areas($(String.format("N%d", i))).build());
		}
		//		prefecture
		for (int i = 1; i <= 47; i++) {
			list.add(SchoolRequest.of().prefectures($(String.format("%02d", i))).build());
		}
		//		city
		for (int i = 1; i <= 23; i++) {
			list.add(SchoolRequest.of().cities($(String.format("131%02d", i))).build());
		}
		//		other_city
		for (YesAny flag : YesAny.values()) {
			list.add(SchoolRequest.of().prefectures($("13")).otherCity(flag).build());
		}
		//		along 6726
		list.add(SchoolRequest.of().alongs($("6726")).build());
		//		station 6726340
		list.add(SchoolRequest.of().stations($("6726340")).build());
		//		tel 079-247-7393
		list.add(SchoolRequest.of().tels($("0792477393")).build());
		//		zip 671-0101
		list.add(SchoolRequest.of().zips($("6710101")).build());
		//		wday
		for (Wday flag : Wday.values()) {
			list.add(SchoolRequest.of().wday($(flag)).build());
		}
		//		eigyo_time_from
		list.add(SchoolRequest.of().prefectures($("13")).eigyoTimeFrom("1200").build());
		//		eigyo_time_to
		list.add(SchoolRequest.of().prefectures($("13")).eigyoTimeTo("1200").build());
		//		tokucho 01001
		list.add(SchoolRequest.of().tokuchos($("01001")).build());
		//		lat/lng/range/order
		// 品川
		for (Range r : Range.manabiValues()) {
			list.add(SchoolRequest.of().lat(35.609167D).lng(139.730167D).range(r).order(Order.MANABI_ORDER_2).build());
		}
		//		keyword
		list.add(SchoolRequest.of().areas($("N2")).keyword("ヒメジダイガク").build());
		//		keyword_or
		list.add(SchoolRequest.of().areas($("N2")).keywordOr($("ヒメジダイガク")).build());
		//		order
		list.add(SchoolRequest.of().areas($("N2")).order(Order.MANABI_ORDER_1).build());

		return list;
	}

	final SchoolRequest parameter;

	@Autowired
	School api;

	@Override
	protected School api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@SneakyThrows
	@Override
	protected void setParameter() {
		request = parameter;
		request.setKey(config.getKey());
	}
}
