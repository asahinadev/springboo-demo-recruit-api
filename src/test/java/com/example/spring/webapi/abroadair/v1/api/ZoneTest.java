package com.example.spring.webapi.abroadair.v1.api;

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
import com.example.spring.webapi.abroadair.v1.request.ZoneRequest;
import com.example.spring.webapi.abroadair.v1.responce.ZoneResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class ZoneTest
		extends ApiTest<Zone, ZoneRequest, ZoneResponse> {

	@Parameterized.Parameters
	public static List<ZoneRequest> data() {

		List<ZoneRequest> list = new ArrayList<>();
		list.add(ZoneRequest.of().build());
		return list;

	}

	final ZoneRequest parameter;

	@Autowired
	Zone api;

	@Override
	protected Zone api() {

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
