package com.example.spring.webapi.manabi.v2.request;

import java.util.List;

import com.example.spring.common.rest.RequestType;
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
public class PrefectureRequest extends RequestType {

	@JsonProperty("prefecture")
	List<String> prefectures;

	@JsonProperty("area")
	List<String> areas;

	@JsonProperty("keyword")
	String keyword;

}
