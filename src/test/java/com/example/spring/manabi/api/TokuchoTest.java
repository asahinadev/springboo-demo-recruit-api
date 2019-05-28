package com.example.spring.manabi.api;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.Parameter;
import com.example.spring.manabi.request.v2.TokuchoRequest;
import com.example.spring.manabi.response.v2.TokuchoResponse;
import com.example.spring.manabi.values.SchoolType;
import com.example.spring.manabi.values.TokuchoType;
import com.example.spring.values.Flag;

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
		final Flag pickup;
	}

	@Parameterized.Parameters
	public static List<TokuchoParameter> data() {
		return Arrays.asList(
				new TokuchoParameter(TokuchoType.KOUZA, SchoolType.TSUSHIN, Flag.ANY),
				new TokuchoParameter(TokuchoType.KOUZA, SchoolType.TSUSHIN, Flag.YES),
				new TokuchoParameter(TokuchoType.KOUZA, SchoolType.TSUGAKU, Flag.ANY),
				new TokuchoParameter(TokuchoType.KOUZA, SchoolType.TSUGAKU, Flag.YES),
				new TokuchoParameter(TokuchoType.KOUZA, SchoolType.KENYOU, Flag.ANY),
				new TokuchoParameter(TokuchoType.KOUZA, SchoolType.KENYOU, Flag.YES),
				new TokuchoParameter(TokuchoType.KYOTEN, SchoolType.TSUSHIN, Flag.ANY),
				new TokuchoParameter(TokuchoType.KYOTEN, SchoolType.TSUSHIN, Flag.YES),
				new TokuchoParameter(TokuchoType.KYOTEN, SchoolType.TSUGAKU, Flag.ANY),
				new TokuchoParameter(TokuchoType.KYOTEN, SchoolType.TSUGAKU, Flag.YES),
				new TokuchoParameter(TokuchoType.KYOTEN, SchoolType.KENYOU, Flag.ANY),
				new TokuchoParameter(TokuchoType.KYOTEN, SchoolType.KENYOU, Flag.YES));
	}

	final TokuchoParameter parameter;

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
		request = new TokuchoRequest();
		request.setKey(config.getKey());
		request.setTokuchoType(parameter.tokuchoType);
		request.setTktgType(parameter.tktgType);
		request.setPickup(parameter.pickup);
	}
}
