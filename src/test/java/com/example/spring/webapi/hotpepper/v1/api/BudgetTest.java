package com.example.spring.webapi.hotpepper.v1.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import com.example.spring.ApiTest;
import com.example.spring.webapi.hotpepper.v1.request.BudgetRequest;
import com.example.spring.webapi.hotpepper.v1.responce.BudgetResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class BudgetTest
		extends ApiTest<Budget, BudgetRequest, BudgetResponse> {

	@Parameterized.Parameters
	public static List<BudgetRequest> data() {

		return Arrays.asList(
				BudgetRequest.of().build());
	}

	final BudgetRequest parameter;

	@Autowired
	Budget api;

	@Override
	protected Budget api() {

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
