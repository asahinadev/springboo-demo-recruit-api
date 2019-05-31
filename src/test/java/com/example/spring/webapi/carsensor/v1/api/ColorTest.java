package com.example.spring.webapi.carsensor.v1.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.webapi.carsensor.v1.request.ColorRequest;
import com.example.spring.webapi.carsensor.v1.responce.ColorResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ColorTest
		extends ApiTest<Color, ColorRequest, ColorResponse> {

	@Parameterized.Parameters
	public static List<ColorRequest> data() {

		return Arrays.asList(
				ColorRequest.of().build());
	}

	final ColorRequest parameter;

	@Autowired
	Color api;

	@Override
	protected Color api() {

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
