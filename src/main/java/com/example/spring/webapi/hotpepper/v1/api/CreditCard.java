package com.example.spring.webapi.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.hotpepper.v1.request.CreditCardRequest;
import com.example.spring.webapi.hotpepper.v1.responce.CreditCardResponse;

@Service
public class CreditCard
		extends ApiBase<CreditCardRequest, CreditCardResponse> {

	@Override
	protected URI uri() {

		return config.getHotpepper().getCreditCard();
	}
}
