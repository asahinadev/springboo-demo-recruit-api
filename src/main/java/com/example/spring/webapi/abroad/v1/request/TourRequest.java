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
public class TourRequest extends RequestType {

	@JsonProperty("id")
	List<String> ids;

	@JsonProperty("area")
	List<String> areas;

	@JsonProperty("country")
	List<String> countries;

	@JsonProperty("city")
	List<String> cities;

	@JsonProperty("hotel")
	List<String> hotels;

	@JsonProperty("keyword")
	List<String> keywords;

	@JsonProperty("keyword_or")
	List<String> keywordsOr;

	@JsonProperty("theme")
	List<String> themes;

	@JsonProperty("theme_group")
	List<String> themeGroups;

	@JsonProperty("ad_type")
	String ad_type;

	@JsonProperty("osusume")
	List<String> osusumes;

	@JsonProperty("dept")
	List<String> depts;

	@JsonProperty("ym")
	Integer ym;

	@JsonProperty("ymd")
	Integer ymd;

	@JsonProperty("price_min")
	Integer priceMin;

	@JsonProperty("price_max")
	Integer priceMax;

	@JsonProperty("term_min")
	Integer termMin;

	@JsonProperty("term_max")
	Integer termMax;

	@JsonProperty("airline")
	List<String> airlines;

	@JsonProperty("kodaw")
	List<String> kodawaris;

	@JsonProperty("order")
	Order order;

	@JsonProperty("kwic")
	String kwic;

	@JsonProperty("seat_class")
	List<String> seatClasses;
}
