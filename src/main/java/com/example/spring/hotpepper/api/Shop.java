package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.hotpepper.request.v1.ShopRequest;
import com.example.spring.hotpepper.responce.v1.ShopResponse;
import com.example.spring.parts.ApiBase;

@Service
public class Shop
		extends ApiBase<ShopRequest, ShopResponse> {

	@Override
	protected Class<ShopResponse> type() {
		return ShopResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getHotpepper().getShop();
	}
}
