package com.example.spring.hotpepper.request;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BudgetRequest extends CommonRequest {

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		return queries;
	}
}
