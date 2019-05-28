package com.example.spring.hotpepper.v1.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.JsonBuilder;
import com.example.spring.hotpepper.v1.api.Gourmet;
import com.example.spring.hotpepper.v1.request.GourmetRequest;
import com.example.spring.hotpepper.v1.responce.GourmetResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class GourmetTest
		extends ApiTest<Gourmet, GourmetRequest, GourmetResponse> {

	@Parameterized.Parameters
	public static List<String> data() {
		return Arrays.asList(
				JsonBuilder.builder().add("id", "J001217232").toString(),
				JsonBuilder.builder().set("name", "オーガニック").toString(),
				JsonBuilder.builder().set("name_kana", "おーがにっく").toString(),
				JsonBuilder.builder().set("name_any", "おーがにっく").toString(),
				JsonBuilder.builder().set("tel", "035550000").toString(),
				JsonBuilder.builder().set("name", "オーガニック").set("address", "東京都").toString(),
				JsonBuilder.builder().add("special", "LT0086", "LT0045").toString(),
				JsonBuilder.builder().add("special_or", "LT0086", "LT0045").toString(),
				JsonBuilder.builder().set("name", "オーガニック").add("special_category", "SPD1", "SPD3").toString(),
				JsonBuilder.builder().set("name", "オーガニック").add("special_category_or", "SPD1", "SPD3").toString(),
				JsonBuilder.builder().set("large_service_area", "SS10").toString(),
				JsonBuilder.builder().add("service_area", "SA11", "SA12").toString(),
				JsonBuilder.builder().add("large_area", "Z011", "Z012").toString(),
				JsonBuilder.builder().add("middle_area", "Y005", "Y006").toString(),
				JsonBuilder.builder().add("small_area", "X015", "X016").toString(),
				JsonBuilder.builder().set("name", "オーガニック").set("keyword", "東京都").toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("range", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("range", 2).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("range", 3).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("range", 4).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("range", 5).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("datum", "tokyo").toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("datum", "world").toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("ktai_coupon", 1).toString(),
				JsonBuilder.builder().set("name", "オーガニック").add("genre", "G007", "G001").toString(),
				JsonBuilder.builder().set("name", "オーガニック").add("budget", "B002", "B001").toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("party_capacity", 10).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("wifi", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("wedding", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("course", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("free_drink", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("free_food", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("private_room", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("horigotatsu", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("tatami", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("cocktail", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("shochu", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("sake", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("wine", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("card", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("non_smoking", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("charter", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("ktai", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("parking", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("barrier_free", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("sommelier", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("night_view", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("open_air", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("show", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("equipment", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("karaoke", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("band", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("tv", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("lunch", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("midnight", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("midnight_meal", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("english", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("pet", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("child", 1).toString(),

				// credit_card
				JsonBuilder.builder().set("lat", 41).set("lng", 135).add("credit_card", "c01", "c02").toString(),

				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("order", 1).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("order", 2).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("order", 3).toString(),
				JsonBuilder.builder().set("lat", 41).set("lng", 135).set("order", 4).toString(),

				// dummy
				JsonBuilder.builder().add("id", "J001217232").toString());
	}

	final String parameter;

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

	ObjectMapper o = new ObjectMapper();
	ObjectReader r = o.readerFor(GourmetRequest.class);

	@Override
	@SneakyThrows
	protected void setParameter() {
		request = r.readValue(parameter);
		request.setKey(config.getKey());
	}

}
