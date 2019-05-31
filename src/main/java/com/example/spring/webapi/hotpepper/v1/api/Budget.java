package com.example.spring.webapi.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.hotpepper.v1.request.BudgetRequest;
import com.example.spring.webapi.hotpepper.v1.responce.BudgetResponse;

@Service
public class Budget
		extends ApiBase<BudgetRequest, BudgetResponse> {

	@Override
	protected URI uri() {

		return config.getHotpepper().getBudget();
	}
}
