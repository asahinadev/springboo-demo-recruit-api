package com.example.spring.webapi.manabi.v2.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.manabi.v2.api.CapsuleType;
import com.example.spring.webapi.manabi.v2.request.CapsuleTypeRequest;
import com.example.spring.webapi.manabi.v2.response.CapsuleTypeResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CapsuleTypeTest
		extends ApiTest<CapsuleType, CapsuleTypeRequest, CapsuleTypeResponse> {

	@Parameterized.Parameters
	public static List<CapsuleTypeRequest> data() {

		List<CapsuleTypeRequest> list = new ArrayList<>();
		// list.add(CapsuleTypeRequest.of().build());

		//		capsule_type (01)
		list.add(CapsuleTypeRequest.of().capsuleTypes($("01")).build());

		return list;
	}

	final CapsuleTypeRequest parameter;

	@Autowired
	CapsuleType api;

	@Override
	protected CapsuleType api() {

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
