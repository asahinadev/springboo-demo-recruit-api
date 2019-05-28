package com.example.spring.manabi.v2.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.manabi.v2.api.ShikakuType;
import com.example.spring.manabi.v2.request.ShikakuTypeRequest;
import com.example.spring.manabi.v2.response.ShikakuTypeResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ShikakuTypeTest
		extends ApiTest<ShikakuType, ShikakuTypeRequest, ShikakuTypeResponse> {

	@Parameterized.Parameters
	public static List<ShikakuTypeRequest> data() {
		return Arrays.asList(
				ShikakuTypeRequest.of().shikakuTypes($("00")).build(),
				ShikakuTypeRequest.of().shikakuTypes($("01")).build(),
				ShikakuTypeRequest.of().shikakuTypes($("02")).build(),
				ShikakuTypeRequest.of().shikakuTypes($("03")).build(),
				ShikakuTypeRequest.of().build());
	}

	final ShikakuTypeRequest parameter;

	@Autowired
	ShikakuType api;

	@Override
	protected ShikakuType api() {
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
