package com.example.spring.webapi.abroad.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.abroad.v1.request.KodawariRequest;
import com.example.spring.webapi.abroad.v1.responce.KodawariResponse;

@Service
public class Kodawari
		extends ApiBase<KodawariRequest, KodawariResponse> {

	@Override
	protected URI uri() {

		return config.getAbroad().getKodawari();
	}

}
