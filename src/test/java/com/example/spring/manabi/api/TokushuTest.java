package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.hotpepper.api.sub.Parameter;
import com.example.spring.manabi.request.v2.TokushuRequest;
import com.example.spring.manabi.response.v2.TokushuResponse;
import com.example.spring.manabi.values.Flag;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class TokushuTest
		extends ApiTest<Tokushu, TokushuRequest, TokushuResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter($("T700001", "T700002")),
				new Parameter(null, $("GG11", "GG12")),
				new Parameter("1"),
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	Tokushu api;

	@Override
	protected Tokushu api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new TokushuRequest();
		request.setKey(config.getKey());
		request.setTokushus(parameter.c1);
		request.setKikakus(parameter.c2);
		if (Objects.equals(parameter.k, "1")) {
			request.setEvent(Flag.Y);
		}
	}
}
