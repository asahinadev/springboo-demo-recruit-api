package com.example.spring.webapi.manabi.v2.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.manabi.v2.api.Capsule;
import com.example.spring.webapi.manabi.v2.request.CapsuleRequest;
import com.example.spring.webapi.manabi.v2.response.CapsuleResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CapsuleTest
		extends ApiTest<Capsule, CapsuleRequest, CapsuleResponse> {

	@Parameterized.Parameters
	public static List<CapsuleRequest> data() {
		List<CapsuleRequest> list = new ArrayList<>();
		// list.add(CapsuleRequest.of().build());

		//		category (G010029)
		list.add(CapsuleRequest.of().categories($("G010029")).build());
		//		genre (J000001)
		list.add(CapsuleRequest.of().genres($("J000001")).build());
		//		capsule (G020001)
		list.add(CapsuleRequest.of().capsules($("G020001")).build());

		return list;
	}

	final CapsuleRequest parameter;

	@Autowired
	Capsule api;

	@Override
	protected Capsule api() {
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
