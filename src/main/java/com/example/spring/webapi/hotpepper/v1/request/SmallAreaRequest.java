package com.example.spring.webapi.hotpepper.v1.request;

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
public class SmallAreaRequest extends RequestType {

	@JsonProperty("large_area")
	List<String> largeAreas;
	@JsonProperty("middle_area")
	List<String> middleAreas;
	@JsonProperty("small_area")
	List<String> smallAreas;
	@JsonProperty("keyword")
	String keyword;

}
