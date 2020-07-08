package com.example.spring.hotpepper.request;

import java.util.List;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MiddleAreaRequest extends CommonRequest {
	List<String> middle_area;
	List<String> large_area;
	String keyword;
	int start = 0;
	int count = 0;

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		set(queries, "middle_area", middle_area);
		set(queries, "large_area", large_area);
		set(queries, "keyword", keyword);
		set(queries, "start", start);
		set(queries, "count", count);
		return queries;
	}
}
