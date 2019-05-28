package com.example.spring.hotpepper.api;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.hotpepper.request.v1.ShopRequest;
import com.example.spring.hotpepper.responce.v1.ShopResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ShopTest
		extends ApiTest<Shop, ShopRequest, ShopResponse> {

	@Parameterized.Parameters
	public static List<Parameter> data() {
		return Arrays.asList(
				new Parameter("05058281355"),
				new Parameter("オーガニック"));
	}

	final Parameter parameter;

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
		request = new ShopRequest();
		request.setKey(config.getKey());
		if (StringUtils.isNumeric(parameter.k)
				&& StringUtils.isAsciiPrintable(parameter.k)) {
			request.setTel(parameter.k);
		} else {
			request.setKeyword(parameter.k);
		}
	}

}
