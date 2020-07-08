package com.example.spring.carsensor.request;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrandRequest extends CommonRequest {

	String code;
	String country;

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		set(queries, "code", code);
		set(queries, "country", country);
		return queries;
	}
}
