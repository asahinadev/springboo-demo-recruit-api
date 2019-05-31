package com.example.spring.webapi.hotpepper.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import com.example.spring.ApiTest;
import com.example.spring.webapi.hotpepper.v1.request.MiddleAreaRequest;
import com.example.spring.webapi.hotpepper.v1.responce.MiddleAreaResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class MiddleAreaTest
		extends ApiTest<MiddleArea, MiddleAreaRequest, MiddleAreaResponse> {

	@Parameterized.Parameters
	public static List<MiddleAreaRequest> data() {

		List<MiddleAreaRequest> list = new ArrayList<>();
		list.add(MiddleAreaRequest.of().largeAreas($("Z011")).build());
		list.add(MiddleAreaRequest.of().middleAreas($("Y004")).build());
		list.add(MiddleAreaRequest.of().keyword("月島").build());
		list.add(MiddleAreaRequest.of().build());
		return list;
	}

	final MiddleAreaRequest parameter;

	@Autowired
	MiddleArea api;

	@Override
	protected MiddleArea api() {

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
