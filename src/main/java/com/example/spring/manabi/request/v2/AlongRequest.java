package com.example.spring.manabi.request.v2;

import java.util.List;

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

}
