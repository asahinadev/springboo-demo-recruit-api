package com.example.spring.hotpepper.request;

import java.util.List;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopRequest extends CommonRequest {

	String tel;
	List<String> keyword;
	int start = 0;
	int count = 0;

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		set(queries, "tel", tel);
		set(queries, "keyword", keyword);
		set(queries, "start", start);
		set(queries, "count", count);
		return queries;
	}
}
