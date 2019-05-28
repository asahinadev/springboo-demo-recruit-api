package com.example.spring.webapi.manabi.v2.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.manabi.v2.api.Tokucho;
import com.example.spring.webapi.manabi.v2.request.TokuchoRequest;
import com.example.spring.webapi.manabi.v2.response.TokuchoResponse;
import com.example.spring.webapi.manabi.v2.values.SchoolType;
import com.example.spring.webapi.manabi.v2.values.TokuchoType;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class TokuchoTest
		extends ApiTest<Tokucho, TokuchoRequest, TokuchoResponse> {

	@RequiredArgsConstructor
	public static class TokuchoParameter extends Parameter {
		final TokuchoType tokuchoType;
		final SchoolType tktgType;
		final YesAny pickup;
	}

	@Parameterized.Parameters
	public static List<TokuchoRequest> data() {
		return Arrays.asList(

				TokuchoRequest.of()
						.tokuchoType(TokuchoType.KOUZA)
						.tktgType(SchoolType.TSUSHIN)
						.pickup(YesAny.ANY)
						.build(),
				TokuchoRequest.of()
						.tokuchoType(TokuchoType.KOUZA)
						.tktgType(SchoolType.TSUSHIN)
						.pickup(YesAny.YES)
						.build(),
				TokuchoRequest.of()
						.tokuchoType(TokuchoType.KOUZA)
						.tktgType(SchoolType.TSUGAKU)
						.pickup(YesAny.ANY)
						.build(),
				TokuchoRequest.of()
						.tokuchoType(TokuchoType.KOUZA)
						.tktgType(SchoolType.TSUGAKU)
						.pickup(YesAny.YES)
						.build(),
				TokuchoRequest.of()
						.tokuchoType(TokuchoType.KOUZA)
						.tktgType(SchoolType.KENYOU)
						.pickup(YesAny.ANY).build(),
				TokuchoRequest.of()
						.tokuchoType(TokuchoType.KOUZA)
						.tktgType(SchoolType.KENYOU)
						.pickup(YesAny.YES).build(),
				TokuchoRequest.of()
						.tokuchoType(TokuchoType.KYOTEN)
						.tktgType(SchoolType.TSUSHIN)
						.pickup(YesAny.ANY)
						.build(),
				TokuchoRequest.of()
						.tokuchoType(TokuchoType.KYOTEN)
						.tktgType(SchoolType.TSUSHIN)
						.pickup(YesAny.YES)
						.build(),
				TokuchoRequest.of()
						.tokuchoType(TokuchoType.KYOTEN)
						.tktgType(SchoolType.TSUGAKU)
						.pickup(YesAny.ANY)
						.build(),
				TokuchoRequest.of()
						.tokuchoType(TokuchoType.KYOTEN)
						.tktgType(SchoolType.TSUGAKU)
						.pickup(YesAny.YES)
						.build(),
				TokuchoRequest.of().tokuchoType(TokuchoType.KYOTEN)
						.tktgType(SchoolType.KENYOU)
						.pickup(YesAny.ANY).build()

		);
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
