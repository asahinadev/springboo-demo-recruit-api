package com.example.spring.webapi.carsensor.v1.api;

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
import com.example.spring.webapi.carsensor.v1.request.BrandRequest;
import com.example.spring.webapi.carsensor.v1.responce.BrandResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class BrandTest
		extends ApiTest<Brand, BrandRequest, BrandResponse> {

	@Parameterized.Parameters
	public static List<BrandRequest> data() {

		List<BrandRequest> list = new ArrayList<>();

		list.add(BrandRequest.of().codes($("TO")).build());
		list.add(BrandRequest.of().codes($("MA")).build());
		list.add(BrandRequest.of().codes($("NI")).build());
		list.add(BrandRequest.of().codes($("HO")).build());
		list.add(BrandRequest.of().codes($("SB")).build());
		list.add(BrandRequest.of().codes($("SZ")).build());
		list.add(BrandRequest.of().codes($("MI")).build());
		list.add(BrandRequest.of().codes($("DA")).build());

		list.add(BrandRequest.of().countries($("JPN")).build());
		list.add(BrandRequest.of().countries($("GER")).build());
		list.add(BrandRequest.of().countries($("USA")).build());

		list.add(BrandRequest.of().build());
		return list;
	}

	final BrandRequest parameter;

	@Autowired
	Brand api;

	@Override
	protected Brand api() {

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
