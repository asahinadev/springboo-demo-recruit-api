package com.example.spring.webapi.hotpepper.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.hotpepper.v1.request.LargeAreaRequest;
import com.example.spring.webapi.hotpepper.v1.responce.LargeAreaResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class LargeAreaTest
		extends ApiTest<LargeArea, LargeAreaRequest, LargeAreaResponse> {

	@Parameterized.Parameters
	public static List<LargeAreaRequest> data() {

		List<LargeAreaRequest> list = new ArrayList<>();
		list.add(LargeAreaRequest.of().largeAreas($("Z011")).build());
		list.add(LargeAreaRequest.of().keyword("月島").build());
		list.add(LargeAreaRequest.of().build());
		return list;
	}

	final LargeAreaRequest parameter;

	@Autowired
	LargeArea api;

	@Override
	protected LargeArea api() {

		return api;
	}

	@Override
	protected Logger logger() {

		return log;
	}

	@Override
	protected void setParameter() {

		request = parameter;
	}

}
