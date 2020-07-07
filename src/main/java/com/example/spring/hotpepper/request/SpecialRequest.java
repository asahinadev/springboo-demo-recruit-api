package com.example.spring.hotpepper.request;

import java.util.List;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SpecialRequest {

	@JsonProperty("special")
	List<String> special;

	@JsonProperty("special_category")
	List<String> scategory;

	public MultiValueMap<String, String> queries(String apiKey) {

		var map = new LinkedMultiValueMap<String, String>();

		// ‹¤’Ê
		map.set("key", apiKey);
		map.set("format", "json");

		// ŒÅ—L
		if (special != null && !special.isEmpty()) {
			map.set("special", String.join(",", special));
		}
		if (scategory != null && !scategory.isEmpty()) {
			map.set("special_category", String.join(",", scategory));
		}

		return map;

	}
}
