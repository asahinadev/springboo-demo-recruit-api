package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.hotpepper.request.v1.CreditCardRequest;
import com.example.spring.hotpepper.responce.v1.CreditCardResponse;

@Service
public class CreditCard
		extends ApiBase<CreditCardRequest, CreditCardResponse> {

	@Override
	protected Class<CreditCardResponse> type() {
		return CreditCardResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getHotpepper().getCreditCard();
	}
}
