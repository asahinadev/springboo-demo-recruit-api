package com.example.spring.hotpepper.request;

import java.util.List;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpecialCategoryRequest extends CommonRequest {

	List<String> special_category;

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		super.set(queries, "special_category", special_category);
		return queries;
	}
}
