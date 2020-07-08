package com.example.spring.hotpepper.request;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenreRequest extends CommonRequest {

	String code;
	String keyword;

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		set(queries, "code", code);
		set(queries, "keyword", keyword);
		return queries;
	}
}
