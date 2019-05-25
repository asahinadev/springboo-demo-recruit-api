package com.example.spring.manabi.request.v2;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.example.spring.parts.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CategoryRequest extends RequestType {

	@JsonProperty("genre")
	List<String> genres;

	@JsonProperty("category")
	List<String> categories;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "genre", genres);
		add(map, "category", categories);

		return map;
	}

}
