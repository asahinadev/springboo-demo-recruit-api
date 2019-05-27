package com.example.spring.hotpepper.request.v1;

import java.util.List;

import com.example.spring.common.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
