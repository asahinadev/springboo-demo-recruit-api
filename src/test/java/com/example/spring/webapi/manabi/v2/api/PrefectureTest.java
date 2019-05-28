package com.example.spring.webapi.manabi.v2.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.manabi.v2.api.Prefecture;
import com.example.spring.webapi.manabi.v2.request.PrefectureRequest;
import com.example.spring.webapi.manabi.v2.response.PrefectureResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class PrefectureTest
		extends ApiTest<Prefecture, PrefectureRequest, PrefectureResponse> {

	@Parameterized.Parameters
	public static List<PrefectureRequest> data() {
		List<PrefectureRequest> list = new ArrayList<>();

		//		area
		for (int i = 1; i <= 6; i++) {
			list.add(PrefectureRequest.of().areas($(String.format("N%d", i))).build());
		}
		//		prefecture
		for (int i = 1; i <= 47; i++) {
			list.add(PrefectureRequest.of().prefectures($(String.format("%02d", i))).build());
		}

		list.add(PrefectureRequest.of().keyword("北海道").build());
		list.add(PrefectureRequest.of().build());
		return list;
	}

	final PrefectureRequest parameter;

	@Autowired
	Prefecture api;

	@Override
	protected Prefecture api() {
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
