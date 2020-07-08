package com.example.spring.hotpepper.request;

import java.util.List;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LargeAreaRequest extends CommonRequest {

	List<String> large_area;
	String keyword;

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		set(queries, "large_area", large_area);
		set(queries, "keyword", keyword);
		return queries;
	}
}
