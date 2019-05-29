package com.example.spring.webapi.abroad.v1.request;

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
public class ThemeRequest extends RequestType {

	@JsonProperty("code")
	List<String> codes;

	@JsonProperty("group")
	List<String> groups;

	@JsonProperty("category")
	List<String> categories;

	@JsonProperty("keyword")
	List<String> keywords;

	@JsonProperty("in_use")
	String inUse;

}
