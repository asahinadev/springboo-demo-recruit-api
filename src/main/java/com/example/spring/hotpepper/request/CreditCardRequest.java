package com.example.spring.hotpepper.request;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import lombok.Data;

@Data
public class CreditCardRequest {

	public MultiValueMap<String, String> queries(String apiKey) {

		var map = new LinkedMultiValueMap<String, String>();

		// ‹¤’Ê
		map.set("key", apiKey);
		map.set("format", "json");

		return map;

	}
}
