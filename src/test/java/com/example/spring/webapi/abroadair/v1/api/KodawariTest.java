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
import com.example.spring.webapi.abroadair.v1.request.KodawariRequest;
import com.example.spring.webapi.abroadair.v1.responce.KodawariResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class KodawariTest
		extends ApiTest<Kodawari, KodawariRequest, KodawariResponse> {

	@Parameterized.Parameters
	public static List<KodawariRequest> data() {

		List<KodawariRequest> list = new ArrayList<>();
		list.add(KodawariRequest.of().build());
		return list;

	}

	final KodawariRequest parameter;

	@Autowired
	Kodawari api;

	@Override
	protected Kodawari api() {

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
