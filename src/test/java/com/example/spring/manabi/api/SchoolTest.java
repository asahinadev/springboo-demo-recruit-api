package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.JsonBuilder;
import com.example.spring.manabi.request.v2.SchoolRequest;
import com.example.spring.manabi.response.v2.SchoolResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SchoolTest
		extends ApiTest<School, SchoolRequest, SchoolResponse> {

	static JsonBuilder builder() {
		return JsonBuilder.builder().add("area", "N1");
	}

	@Parameterized.Parameters
	public static List<String> data() {
		return Arrays.asList(
				builder().set("kyoten_type", "TG").toString(),
				builder().set("kyoten_type", "TK").toString(),
				builder().add("school", "H900064").toString(),
				builder().add("kyoten", "0010511279").toString(),
				builder().add("capsule_type", "01").toString(),
				builder().add("capsule_type", "02").toString(),
				builder().add("capsule_type", "03").toString(),
				builder().add("category", "G010025").toString(),
				builder().add("capsule", "G020306").toString(),
				builder().add("sub_capsule", "G020306").toString(),
				builder().add("tokushu", "T700002").toString(),
				builder().add("prefecture", "13").toString(),
				builder().add("city", "13102").toString(),
				builder().add("along", "2172").toString(),
				builder().add("station", "2172010").toString(),
				builder().add("tel", "0300001000").toString(),
				builder().add("zip", "100012").toString(),
				builder().add("wday", "1").toString(),
				builder().add("wday", "2").toString(),
				builder().add("wday", "3").toString(),
				builder().add("wday", "4").toString(),
				builder().add("wday", "5").toString(),
				builder().add("wday", "6").toString(),
				builder().add("wday", "7").toString(),
				builder().set("eigyo_time_from", "1000").toString(),
				builder().set("eigyo_time_to", "1600").toString(),
				builder().add("tokucho", "9999999999999").toString(),
				builder().set("lat", "35").set("lng", "135").set("range", "1").set("order", "1").toString(),
				builder().set("lat", "35").set("lng", "135").set("range", "2").set("order", "2").toString(),
				builder().set("lat", "35").set("lng", "135").set("range", "3").toString(),
				builder().set("lat", "35").set("lng", "135").set("range", "4").toString(),
				builder().set("lat", "35").set("lng", "135").set("range", "5").toString(),
				builder().set("keyword", "ネイル").toString(),
				builder().add("keyword_or", "ネイル").toString()

		/**/);
	}

	final String parameter;

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
		request = new ObjectMapper().readValue(parameter, SchoolRequest.class);
		request.setKey(config.getKey());
	}
}
