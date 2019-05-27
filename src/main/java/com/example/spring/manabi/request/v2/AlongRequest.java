package com.example.spring.manabi.request.v2;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.example.spring.common.RequestType;
import com.example.spring.manabi.values.AlongType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class AlongRequest extends RequestType {

	@JsonProperty("along")
	List<String> alongs;

	@JsonProperty("along_type")
	List<AlongType> alongTypes;

	@JsonProperty("city")
	List<String> cities;

	@JsonProperty("prefecture")
	List<String> prefectures;

	@JsonProperty("keyword")
	String keyword;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "along", alongs);
		add(map, "along_type", alongTypes, AlongType::getId, item -> {
			return item != AlongType.NONE;
		});
		add(map, "city", cities);
		add(map, "prefecture", prefectures);
		add(map, "keyword", keyword);

		return map;
	}

}