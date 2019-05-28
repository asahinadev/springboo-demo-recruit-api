package com.example.spring.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.hotpepper.v1.request.ShopRequest;
import com.example.spring.hotpepper.v1.responce.ShopResponse;

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
