package com.example.spring.webapi.hotpepper.v1.api;

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
import com.example.spring.common.values.Datum;
import com.example.spring.common.values.Order;
import com.example.spring.common.values.Range;
import com.example.spring.common.values.YesAny;
import com.example.spring.common.values.YesNoAny;
import com.example.spring.webapi.hotpepper.v1.request.GourmetRequest;
import com.example.spring.webapi.hotpepper.v1.responce.GourmetResponse;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class GourmetTest
		extends ApiTest<Gourmet, GourmetRequest, GourmetResponse> {

	@Parameterized.Parameters
	public static List<GourmetRequest> data() {

		List<GourmetRequest> list = new ArrayList<>();
		list.add(GourmetRequest.of().id($("J001217232")).build());
		list.add(GourmetRequest.of().name("オーガニック").build());
		list.add(GourmetRequest.of().nameKana("オーガニック").build());
		list.add(GourmetRequest.of().nameAny("オーガニック").build());
		list.add(GourmetRequest.of().tel("035550000").build());
		list.add(GourmetRequest.of().name("オーガニック").address("東京都").build());
		list.add(GourmetRequest.of().specials($("LT0080")).build());
		list.add(GourmetRequest.of().specialsOr($("LT0080")).build());
		list.add(GourmetRequest.of().name("オーガニック").specialCategories($("SPA9")).build());
		list.add(GourmetRequest.of().name("オーガニック").specialCategoriesOr($("SPA9")).build());
		list.add(GourmetRequest.of().largeServiceAreas("SS10").build());
		list.add(GourmetRequest.of().serviceAreas($("SA10")).build());
		list.add(GourmetRequest.of().largeAreas($("Z011")).build());
		list.add(GourmetRequest.of().middleAreas($("Y004")).build());
		list.add(GourmetRequest.of().smallAreas($("X004")).build());
		for (Range r : Range.hotpepperValues()) {
			for (Order o : Order.hotpepperValues()) {
				for (Datum d : Datum.values()) {
					list.add(GourmetRequest.of().lat(35.609167D).lng(139.730167D).range(r).order(o).datum(d).build());
				}
			}
		}
		list.add(GourmetRequest.of().keyword($("居酒屋")).genre($("G001")).build());
		for (YesNoAny f : YesNoAny.values()) {
			list.add(GourmetRequest.of().keyword($("居酒屋")).ktaiCoupon(f).build());
		}
		list.add(GourmetRequest.of().keyword($("居酒屋")).budget($("B002")).build());
		list.add(GourmetRequest.of().keyword($("居酒屋")).partyCapacity(50).build());
		for (YesAny f : YesAny.values()) {
			list.add(GourmetRequest.of().keyword($("居酒屋")).wifi(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).wedding(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).course(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).freeDrink(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).freeFood(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).privateRoom(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).horigotatsu(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).tatami(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).cocktail(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).shochu(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).sake(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).wine(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).card(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).nonSmoking(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).charter(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).ktai(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).parking(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).barrierFree(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).sommelier(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).nightView(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).openAir(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).show(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).equipment(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).karaoke(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).band(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).tv(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).lunch(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).midnight(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).midnightMeal(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).english(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).pet(f).build());
			list.add(GourmetRequest.of().keyword($("居酒屋")).child(f).build());
		}
		list.add(GourmetRequest.of().keyword($("居酒屋")).creditCard($("c01")).build());
		return list;
	}

	final GourmetRequest parameter;

	@Autowired
	Gourmet api;

	@Override
	protected Gourmet api() {

		return api;
	}

	@Override
	protected Logger logger() {

		return log;
	}

	@Override
	@SneakyThrows
	protected void setParameter() {

		request = parameter;
		request.setKey(config.getKey());
	}

}
