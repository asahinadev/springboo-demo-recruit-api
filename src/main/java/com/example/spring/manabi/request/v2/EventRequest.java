package com.example.spring.manabi.request.v2;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.example.spring.common.RequestType;
import com.example.spring.manabi.values.MapDisp;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class EventRequest extends RequestType {

	@JsonProperty("city")
	List<String> cities;

	@JsonProperty("prefecture")
	List<String> prefectures;

	@JsonProperty("area")
	List<String> areas;

	@JsonProperty("keyword")
	String keyword;

	@JsonProperty("map_disp")
	MapDisp mapDisp = MapDisp.YES;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "city", cities);
		add(map, "prefecture", prefectures);
		add(map, "area", areas);
		add(map, "keyword", keyword);
		add(map, "map_disp", mapDisp);

		return map;
	}
}
