package com.example.spring.manabi.v2.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.manabi.v2.api.SubCapsule;
import com.example.spring.manabi.v2.request.SubCapsuleRequest;
import com.example.spring.manabi.v2.response.SubCapsuleResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SubCapsuleTest
		extends ApiTest<SubCapsule, SubCapsuleRequest, SubCapsuleResponse> {

	@Parameterized.Parameters
	public static List<SubCapsuleRequest> data() {
		return Arrays.asList(
				SubCapsuleRequest.of().subCapsules($("SB00001", "SB00002")).build(),
				SubCapsuleRequest.of().capsules($("G020001", "G020002")).build(),
				SubCapsuleRequest.of().categories($("G010001", "G010002")).build(),
				SubCapsuleRequest.of().genres($("J000001", "J000002")).build(),
				SubCapsuleRequest.of().keyword("英会話").build(),
				SubCapsuleRequest.of().build()

		);
	}

	final SubCapsuleRequest parameter;

	@Autowired
	SubCapsule api;

	@Override
	protected SubCapsule api() {
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
