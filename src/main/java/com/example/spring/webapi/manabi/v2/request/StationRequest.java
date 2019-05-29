package com.example.spring.webapi.manabi.v2.request;

import java.util.List;

import com.example.spring.common.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
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
