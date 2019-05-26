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
public class StationRequest extends RequestType {

	@JsonProperty("station")
	List<String> stations;

	@JsonProperty("facility")
	List<String> facilities;

	@JsonProperty("along")
	List<String> alongs;

	@JsonProperty("city")
	List<String> cities;

	@JsonProperty("prefecture")
	List<String> prefectures;

	@JsonProperty("keyword")
	String keyword;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "station", stations);
		add(map, "facility", facilities);
		add(map, "along", alongs);
		add(map, "city", cities);
		add(map, "prefecture", prefectures);
		add(map, "keyword", keyword);

		return map;
	}

}
