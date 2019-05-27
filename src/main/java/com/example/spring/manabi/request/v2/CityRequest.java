package com.example.spring.manabi.request.v2;

import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.manabi.values.MapDisp;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CityRequest extends RequestType {

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

}
