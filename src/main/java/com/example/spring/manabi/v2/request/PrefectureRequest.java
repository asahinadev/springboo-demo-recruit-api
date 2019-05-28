package com.example.spring.manabi.v2.request;

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
public class PrefectureRequest extends RequestType {

	@JsonProperty("prefecture")
	List<String> prefectures;
	@JsonProperty("area")
	List<String> areas;
	@JsonProperty("keyword")
	String keyword;

}
