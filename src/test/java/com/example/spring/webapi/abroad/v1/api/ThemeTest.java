package com.example.spring.webapi.abroad.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.abroad.v1.request.ThemeRequest;
import com.example.spring.webapi.abroad.v1.responce.ThemeResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ThemeTest
		extends ApiTest<Theme, ThemeRequest, ThemeResponse> {

	@Parameterized.Parameters
	public static List<ThemeRequest> data() {

		List<ThemeRequest> list = new ArrayList<>();

		list.add(ThemeRequest.of().build());
		list.add(ThemeRequest.of().codes($("000003")).build());
		list.add(ThemeRequest.of().groups($("G00001")).build());
		list.add(ThemeRequest.of().groups($("G00002")).build());
		list.add(ThemeRequest.of().groups($("G00003")).build());
		list.add(ThemeRequest.of().groups($("G00004")).build());
		list.add(ThemeRequest.of().groups($("G00005")).build());
		list.add(ThemeRequest.of().groups($("G00006")).build());
		list.add(ThemeRequest.of().categories($("001")).build());
		list.add(ThemeRequest.of().categories($("002")).build());
		list.add(ThemeRequest.of().keywords($("ベトナム")).build());
		list.add(ThemeRequest.of().inUse("0").build());
		list.add(ThemeRequest.of().inUse("1").build());

		return list;

	}

	final ThemeRequest parameter;

	@Autowired
	Theme api;

	@Override
	protected Theme api() {

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
