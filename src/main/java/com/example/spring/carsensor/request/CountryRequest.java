package com.example.spring.carsensor.request;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryRequest extends CommonRequest {

	String code;

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		set(queries, "code", code);
		return queries;
	}
}
