package com.example.spring.manabi.v2.request;

import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.manabi.v2.values.AlongType;
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
