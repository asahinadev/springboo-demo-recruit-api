package com.example.spring.carsensor.request;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColorRequest extends CommonRequest {

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		return queries;
	}
}
