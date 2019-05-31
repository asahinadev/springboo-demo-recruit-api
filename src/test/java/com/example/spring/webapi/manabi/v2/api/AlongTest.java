package com.example.spring.webapi.manabi.v2.api;

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
import com.example.spring.webapi.manabi.v2.api.Along;
import com.example.spring.webapi.manabi.v2.request.AlongRequest;
import com.example.spring.webapi.manabi.v2.response.AlongResponse;
import com.example.spring.webapi.manabi.v2.values.AlongType;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class AlongTest
		extends ApiTest<Along, AlongRequest, AlongResponse> {

	@Parameterized.Parameters
	public static List<AlongRequest> data() {

		List<AlongRequest> list = new ArrayList<>();
		// list.add(AlongRequest.of().build());

		//		prefecture
		for (int i = 1; i <= 47; i++) {
			list.add(AlongRequest.of().prefectures($(String.format("%02d", i))).build());
		}
		//		city
		for (int i = 1; i <= 23; i++) {
			list.add(AlongRequest.of().cities($(String.format("131%02d", i))).build());
		}

		// along 
		list.add(AlongRequest.of().alongs($("1084")).build());
		// along_type
		for (AlongType type : AlongType.values()) {
			list.add(AlongRequest.of().alongTypes($(type)).build());
		}

		list.add(AlongRequest.of().keyword("東海道").build());
		list.add(AlongRequest.of().build());

		return list;
	}

	final AlongRequest parameter;

	@Autowired
	Along api;

	@Override
	protected Along api() {

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
