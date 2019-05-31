package com.example.spring.webapi.manabi.v2.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import com.example.spring.ApiTest;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.manabi.v2.api.Tokushu;
import com.example.spring.webapi.manabi.v2.request.TokushuRequest;
import com.example.spring.webapi.manabi.v2.response.TokushuResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class TokushuTest
		extends ApiTest<Tokushu, TokushuRequest, TokushuResponse> {

	@Parameterized.Parameters
	public static List<TokushuRequest> data() {

		return Arrays.asList(
				TokushuRequest.of().tokushus($("T700001")).build(),
				TokushuRequest.of().kikakus($("GG11")).build(),
				TokushuRequest.of().kikakus($("GG12")).build(),
				TokushuRequest.of().event(YesAny.ANY).build(),
				TokushuRequest.of().event(YesAny.YES).build()

		);
	}

	final TokushuRequest parameter;

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

		request = parameter;
		request.setKey(config.getKey());
	}
}
