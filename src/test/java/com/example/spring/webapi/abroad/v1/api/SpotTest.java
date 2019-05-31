package com.example.spring.webapi.abroad.v1.api;

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
import com.example.spring.webapi.abroad.v1.request.SpotRequest;
import com.example.spring.webapi.abroad.v1.responce.SpotResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class SpotTest
		extends ApiTest<Spot, SpotRequest, SpotResponse> {

	@Parameterized.Parameters
	public static List<SpotRequest> data() {

		List<SpotRequest> list = new ArrayList<>();

		list.add(SpotRequest.of().build());
		list.add(SpotRequest.of().areas($("EUR")).build());
		list.add(SpotRequest.of().countries($("BE")).build());
		list.add(SpotRequest.of().cities($("NY")).build());
		list.add(SpotRequest.of().keywords($("ベトナム")).build());

		return list;

	}

	final SpotRequest parameter;

	@Autowired
	Spot api;

	@Override
	protected Spot api() {

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
