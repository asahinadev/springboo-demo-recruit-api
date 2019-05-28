package com.example.spring.hotpepper.v1.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.hotpepper.v1.api.CreditCard;
import com.example.spring.hotpepper.v1.request.CreditCardRequest;
import com.example.spring.hotpepper.v1.responce.CreditCardResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CreditCardTest
		extends ApiTest<CreditCard, CreditCardRequest, CreditCardResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter());
	}

	final Parameter parameter;

	@Autowired
	CreditCard api;

	@Override
	protected CreditCard api() {
		return api;
	}

	@Override
	protected Logger logger() {
		return log;
	}

	@Override
	protected void setParameter() {
		request = new CreditCardRequest();
		request.setKey(config.getKey());
	}

}