package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.manabi.request.v2.TsugakuRequest;
import com.example.spring.manabi.response.v2.TsugakuResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class TsugakuTest
		extends ApiTest<Tsugaku, TsugakuRequest, TsugakuResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter(1, $("13101", "13102")),
				new Parameter(2, $("13", "01")),
				new Parameter(3, $("N1", "N2")));
	}

	final Parameter parameter;

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
		request = new TsugakuRequest();
		request.setKey(config.getKey());
		request.setCities(parameter.c1);
		request.setPrefectures(parameter.c2);
		request.setAreas(parameter.c3);
	}
}
