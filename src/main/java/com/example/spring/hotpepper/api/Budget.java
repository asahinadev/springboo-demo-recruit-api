package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.hotpepper.request.v1.BudgetRequest;
import com.example.spring.hotpepper.responce.v1.BudgetResponse;
import com.example.spring.parts.ApiBase;

@Service
public class Budget
		extends ApiBase<BudgetRequest, BudgetResponse> {

	@Override
	protected Class<BudgetResponse> type() {
		return BudgetResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getHotpepper().getBudget();
	}
}
