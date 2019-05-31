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
import com.example.spring.webapi.hotpepper.v1.request.GenreRequest;
import com.example.spring.webapi.hotpepper.v1.responce.GenreResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class GenreTest
		extends ApiTest<Genre, GenreRequest, GenreResponse> {

	@Parameterized.Parameters
	public static List<GenreRequest> data() {

		List<GenreRequest> list = new ArrayList<>();
		list.add(GenreRequest.of().build());
		list.add(GenreRequest.of().codes($("G001")).build());
		list.add(GenreRequest.of().keyword("居酒屋").build());
		return list;

	}

	final GenreRequest parameter;

	@Autowired
	Genre api;

	@Override
	protected Genre api() {

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
