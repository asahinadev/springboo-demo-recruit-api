package com.example.spring.webapi.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.hotpepper.v1.request.ShopRequest;
import com.example.spring.webapi.hotpepper.v1.responce.ShopResponse;

@Service
public class Shop
		extends ApiBase<ShopRequest, ShopResponse> {

	@Override
	protected URI uri() {

		return config.getHotpepper().getShop();
	}
}
