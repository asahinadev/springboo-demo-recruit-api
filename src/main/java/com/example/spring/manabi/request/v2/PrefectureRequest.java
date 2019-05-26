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
public class PrefectureRequest extends RequestType {

	@JsonProperty("prefecture")
	List<String> prefectures;

	@JsonProperty("area")
	List<String> areas;

	@JsonProperty("keyword")
	String keyword;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "prefecture", prefectures);
		add(map, "area", areas);
		add(map, "keyword", keyword);

		return map;
	}

}
