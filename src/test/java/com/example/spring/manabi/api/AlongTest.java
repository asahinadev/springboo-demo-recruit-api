package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.manabi.request.v2.AlongRequest;
import com.example.spring.manabi.response.v2.AlongResponse;
import com.example.spring.manabi.values.AlongType;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class AlongTest
		extends ApiTest<Along, AlongRequest, AlongResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter(1, $("1084", "1084")),
				new Parameter(2, $("13101", "13102")),
				new Parameter(3, $("13", "1")),
				new Parameter("along_type", Arrays.asList(AlongType.JR), ""),
				new Parameter("東海道線"),
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	Along api;

	@Override
	protected Along api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new AlongRequest();
		request.setKey(config.getKey());
		request.setAlongs(parameter.c1);
		request.setCities(parameter.c2);
		request.setPrefectures(parameter.c3);
		request.setKeyword(parameter.k);
	}
}
