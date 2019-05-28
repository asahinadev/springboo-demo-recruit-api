package com.example.spring.webapi.abroadair.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.abroadair.v1.request.ZoneRequest;
import com.example.spring.webapi.abroadair.v1.responce.ZoneResponse;

@Service
public class Zone
		extends ApiBase<ZoneRequest, ZoneResponse> {

	@Override
	protected Class<ZoneResponse> type() {
		return ZoneResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getAbroadair().getZone();
	}
}
