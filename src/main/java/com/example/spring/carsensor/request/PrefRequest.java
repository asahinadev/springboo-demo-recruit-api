package com.example.spring.carsensor.request;

import java.util.List;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrefRequest extends CommonRequest {

	String code;
	List<String> large_area;

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		set(queries, "code", code);
		set(queries, "large_area", large_area);
		return queries;
	}
}
