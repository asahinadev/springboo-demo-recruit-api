package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.manabi.v2.request.ShikakuTypeRequest;
import com.example.spring.webapi.manabi.v2.response.ShikakuTypeResponse;

@Service
public class ShikakuType
		extends ApiBase<ShikakuTypeRequest, ShikakuTypeResponse> {

	@Override
	protected URI uri() {

		return config.getManabi().getShikakuType();
	}
}
