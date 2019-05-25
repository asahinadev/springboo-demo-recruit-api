package com.example.spring.hotpepper.request.v1;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.example.spring.hotpepper.parts.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class SmallAreaRequest extends RequestType {

	@JsonProperty("large_area")
	List<String> largeAreas;

	@JsonProperty("middle_area")
	List<String> middleAreas;

	@JsonProperty("small_area")
	List<String> smallAreas;

	@JsonProperty("keyword")
	String keyword;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "large_area", largeAreas);
		add(map, "middle_area", middleAreas);
		add(map, "small_area", smallAreas);
		add(map, "keyword", keyword);

		return map;
	}

}
