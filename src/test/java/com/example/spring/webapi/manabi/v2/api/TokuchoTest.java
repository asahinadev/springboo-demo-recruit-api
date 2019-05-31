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
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.manabi.v2.request.TokuchoRequest;
import com.example.spring.webapi.manabi.v2.response.TokuchoResponse;
import com.example.spring.webapi.manabi.v2.values.SchoolType;
import com.example.spring.webapi.manabi.v2.values.TokuchoType;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class TokuchoTest
		extends ApiTest<Tokucho, TokuchoRequest, TokuchoResponse> {

	@Parameterized.Parameters
	public static List<TokuchoRequest> data() {

		List<TokuchoRequest> list = new ArrayList<>();
		for (TokuchoType a : TokuchoType.values()) {
			for (SchoolType b : SchoolType.values()) {
				for (YesAny c : YesAny.values()) {
					list.add(TokuchoRequest.of()
							.tokuchoType(a)
							.tktgType(b)
							.pickup(c)
							.build());
				}
			}
		}

		return list;

	}

	final TokuchoRequest parameter;

	@Autowired
	Tokucho api;

	@Override
	protected Tokucho api() {

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
