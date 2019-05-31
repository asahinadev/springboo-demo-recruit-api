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
import com.example.spring.webapi.hotpepper.v1.request.SmallAreaRequest;
import com.example.spring.webapi.hotpepper.v1.responce.SmallAreaResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class SmallAreaTest
		extends ApiTest<SmallArea, SmallAreaRequest, SmallAreaResponse> {

	@Parameterized.Parameters
	public static List<SmallAreaRequest> data() {

		List<SmallAreaRequest> list = new ArrayList<>();
		list.add(SmallAreaRequest.of().largeAreas($("Z011")).build());
		list.add(SmallAreaRequest.of().middleAreas($("Y004")).build());
		list.add(SmallAreaRequest.of().smallAreas($("X004")).build());
		list.add(SmallAreaRequest.of().keyword("月島").build());
		list.add(SmallAreaRequest.of().build());
		return list;
	}

	final SmallAreaRequest parameter;

	@Autowired
	SmallArea api;

	@Override
	protected SmallArea api() {

		return api;
	}

	@Override
	protected Logger logger() {

		return log;
	}

	@Override
	protected void setParameter() {

		log.debug("parameter {}", parameter);

		request = parameter;
		request.setKey(config.getKey());
	}

}
