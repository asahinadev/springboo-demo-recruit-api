package com.example.spring.webapi.carsensor.v1.request;

import java.util.List;

import com.example.spring.common.rest.RequestType;
import com.example.spring.common.values.Datum;
import com.example.spring.common.values.Order;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.carsensor.v1.values.Mission;
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
public class UsedcarRequest extends RequestType {

	@JsonProperty("id")
	List<String> ids;

	@JsonProperty("brand")
	List<String> brands;

	@JsonProperty("model")
	String model;

	@JsonProperty("country")
	List<String> countries;

	@JsonProperty("large_area")
	List<String> largeAreas;

	@JsonProperty("pref")
	List<String> prefs;

	@JsonProperty("body")
	List<String> bodies;

	@JsonProperty("person")
	Integer person;

	@JsonProperty("color")
	List<String> colors;

	@JsonProperty("price_min")
	Integer priceMin;

	@JsonProperty("price_max")
	Integer priceMax;

	@JsonProperty("keyword")
	String keyword;

	@JsonProperty("lat")
	Double lat;

	@JsonProperty("lng")
	Double lng;

	@JsonProperty("range")
	Integer range;

	@JsonProperty("datum")
	Datum datum;

	@JsonProperty("mission")
	Mission mission;

	@JsonProperty("nonsmoking")
	YesAny nonsmoking;

	@JsonProperty("leather")
	YesAny leather;

	@JsonProperty("welfare")
	YesAny welfare;

	@JsonProperty("year_old")
	Integer yearOld;

	@JsonProperty("year_new")
	Integer yearNew;

	@JsonProperty("odd_min")
	Integer oddMin;

	@JsonProperty("odd_max")
	Integer oddMax;

	@JsonProperty("order")
	Order order;

}
