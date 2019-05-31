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
import com.example.spring.webapi.hotpepper.v1.request.ShopRequest;
import com.example.spring.webapi.hotpepper.v1.responce.ShopResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class ShopTest
		extends ApiTest<Shop, ShopRequest, ShopResponse> {

	@Parameterized.Parameters
	public static List<ShopRequest> data() {

		List<ShopRequest> list = new ArrayList<>();
		list.add(ShopRequest.of().tel("05058281355").build());
		list.add(ShopRequest.of().keyword("月島もんじゃ").build());

		return list;
	}

	final ShopRequest parameter;

	@Autowired
	Shop api;

	@Override
	protected Shop api() {

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
