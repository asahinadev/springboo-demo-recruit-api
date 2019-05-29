package com.example.spring.webapi.abroad.v1.request;

import java.util.List;

import com.example.spring.common.rest.RequestType;
import com.example.spring.common.values.Order;
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
public class CityRequest extends RequestType {

	@JsonProperty("area")
	List<String> areas;

	@JsonProperty("country")
	List<String> countries;

	@JsonProperty("city")
	List<String> cities;

	@JsonProperty("keyword")
	List<String> keywords;

	@JsonProperty("in_use")
	String inUse;

	@JsonProperty("order")
	Order order;
}