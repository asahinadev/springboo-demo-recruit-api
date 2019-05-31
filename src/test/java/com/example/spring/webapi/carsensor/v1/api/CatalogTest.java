package com.example.spring.webapi.carsensor.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.ApiTest;
import com.example.spring.common.values.Order;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.carsensor.v1.request.CatalogRequest;
import com.example.spring.webapi.carsensor.v1.responce.CatalogResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CatalogTest
		extends ApiTest<Catalog, CatalogRequest, CatalogResponse> {

	@Parameterized.Parameters
	public static List<CatalogRequest> data() {

		List<CatalogRequest> list = new ArrayList<>();

		list.add(CatalogRequest.of().brands($("TO")).build());
		list.add(CatalogRequest.of().brands($("MA")).build());
		list.add(CatalogRequest.of().brands($("NI")).build());
		list.add(CatalogRequest.of().brands($("HO")).build());
		list.add(CatalogRequest.of().brands($("SB")).build());
		list.add(CatalogRequest.of().brands($("SZ")).build());
		list.add(CatalogRequest.of().brands($("MI")).build());
		list.add(CatalogRequest.of().brands($("DA")).build());

		list.add(CatalogRequest.of().model("インプレッサ").build());
		list.add(CatalogRequest.of().model("スカイライン").build());

		list.add(CatalogRequest.of().countries($("JPN")).build());
		list.add(CatalogRequest.of().countries($("GER")).build());
		list.add(CatalogRequest.of().countries($("USA")).build());

		list.add(CatalogRequest.of().bodies($("S")).build());

		list.add(CatalogRequest.of().person(5).build());
		list.add(CatalogRequest.of().person(5).yearNew(2000).build());
		list.add(CatalogRequest.of().person(5).yearOld(2000).build());

		list.add(CatalogRequest.of().welfare(YesAny.ANY).build());
		list.add(CatalogRequest.of().welfare(YesAny.YES).build());

		list.add(CatalogRequest.of().series("GT").build());
		list.add(CatalogRequest.of().keyword("GT").build());

		list.add(CatalogRequest.of().person(5).width(5000).build());
		list.add(CatalogRequest.of().person(5).height(5000).build());
		list.add(CatalogRequest.of().person(5).length(5000).build());

		list.add(CatalogRequest.of().person(5).order(Order.CARCENSOR_CATALOG_ORDER_1).build());
		list.add(CatalogRequest.of().person(5).order(Order.CARCENSOR_CATALOG_ORDER_2).build());

		return list;
	}

	final CatalogRequest parameter;

	@Autowired
	Catalog api;

	@Override
	protected Catalog api() {

		return api;
	}

	@Override
	protected Logger logger() {

		return log;
	}

	@Override
	protected void setParameter() {

		request = parameter;
		request.setKey(config.getKey());
	}

}
