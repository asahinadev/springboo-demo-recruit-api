package com.example.spring.webapi.carsensor.v1.request;

import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.common.values.Order;
import com.example.spring.common.values.YesAny;
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
public class CatalogRequest extends RequestType {

	@JsonProperty("brand")
	List<String> brands;

	@JsonProperty("model")
	String model;

	@JsonProperty("country")
	List<String> countries;

	@JsonProperty("body")
	List<String> bodies;

	@JsonProperty("person")
	Integer person;

	@JsonProperty("year_old")
	Integer yearOld;

	@JsonProperty("year_new")
	Integer yearNew;

	@JsonProperty("welfare")
	YesAny welfare;

	@JsonProperty("series")
	String series;

	@JsonProperty("keyword")
	String keyword;

	@JsonProperty("width_max")
	Integer width;

	@JsonProperty("height_max")
	Integer height;

	@JsonProperty("length_max")
	Integer length;

	@JsonProperty("order")
	Order order;

}
