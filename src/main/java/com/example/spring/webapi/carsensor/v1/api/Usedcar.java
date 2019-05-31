package com.example.spring.webapi.carsensor.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.carsensor.v1.request.UsedcarRequest;
import com.example.spring.webapi.carsensor.v1.responce.UsedcarResponse;

@Service
public class Usedcar
		extends ApiBase<UsedcarRequest, UsedcarResponse> {

	@Override
	protected URI uri() {

		return config.getCarcensor().getUsedcar();
	}
}
