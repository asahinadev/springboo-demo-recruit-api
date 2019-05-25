package com.example.spring.hotpepper.request.v1;

import org.springframework.util.MultiValueMap;

import com.example.spring.parts.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class ShopRequest extends RequestType {

	@JsonProperty("keyword")
	String keyword;

	@JsonProperty("tel")
	String tel;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "keyword", keyword);
		add(map, "tel", tel);

		return map;
	}

}
