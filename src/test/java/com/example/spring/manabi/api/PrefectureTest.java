package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.manabi.request.v2.PrefectureRequest;
import com.example.spring.manabi.response.v2.PrefectureResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class PrefectureTest
		extends ApiTest<Prefecture, PrefectureRequest, PrefectureResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter(1, $("13", "1")),
				new Parameter(2, $("N1", "N2")),
				new Parameter("北海道"),
				new Parameter());
	}

	final Parameter parameter;

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
		request = new PrefectureRequest();
		request.setKey(config.getKey());
		request.setPrefectures(parameter.c1);
		request.setAreas(parameter.c2);
		request.setKeyword(parameter.k);
	}
}
