package com.example.spring.webapi.abroadair.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.abroadair.v1.request.DeptDetailRequest;
import com.example.spring.webapi.abroadair.v1.responce.DeptDetailResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class DeptDetailTest
		extends ApiTest<DeptDetail, DeptDetailRequest, DeptDetailResponse> {

	@Parameterized.Parameters
	public static List<DeptDetailRequest> data() {

		List<DeptDetailRequest> list = new ArrayList<>();
		list.add(DeptDetailRequest.of().build());
		return list;

	}

	final DeptDetailRequest parameter;

	@Autowired
	DeptDetail api;

	@Override
	protected DeptDetail api() {
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
