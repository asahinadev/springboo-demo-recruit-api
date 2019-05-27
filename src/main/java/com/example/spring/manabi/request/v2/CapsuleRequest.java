package com.example.spring.manabi.request.v2;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.example.spring.common.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CapsuleRequest extends RequestType {

	@JsonProperty("genre")
	List<String> genres;

	@JsonProperty("category")
	List<String> categories;

	@JsonProperty("capsule")
	List<String> capsules;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "genre", genres);
		add(map, "category", categories);
		add(map, "capsule", capsules);

		return map;
	}

}
