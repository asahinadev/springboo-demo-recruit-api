package com.example.spring.webapi.hotpepper.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.hotpepper.v1.request.SpecialRequest;
import com.example.spring.webapi.hotpepper.v1.responce.SpecialResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SpecialTest
		extends ApiTest<Special, SpecialRequest, SpecialResponse> {

	@Parameterized.Parameters
	public static List<SpecialRequest> data() {

		List<SpecialRequest> list = new ArrayList<>();
		list.add(SpecialRequest.of().specials($("LT0080")).build());
		list.add(SpecialRequest.of().specialCategories($("SPA9")).build());
		list.add(SpecialRequest.of().build());
		return list;
	}

	final SpecialRequest parameter;

	@Autowired
	Special api;

	@Override
	protected Special api() {

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
