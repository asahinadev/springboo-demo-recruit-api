package com.example.spring.manabi.request.v2;

import java.util.List;

import com.example.spring.common.RequestType;
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

}
