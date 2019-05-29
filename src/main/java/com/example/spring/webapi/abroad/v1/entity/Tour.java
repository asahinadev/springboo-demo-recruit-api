package com.example.spring.webapi.abroad.v1.entity;

import java.util.List;

import com.example.spring.common.entity.ParameterBase;
import com.example.spring.common.entity.Urls;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Tour extends ParameterBase {

	@JsonProperty("id")
	String id;

	@JsonProperty("last_update")
	String lastUpdate;

	@JsonProperty("last_list_update")
	String lastListUpdate;

	@JsonProperty("term")
	String term;

	@JsonProperty("title")
	String title;

	@JsonProperty("airline")
	List<Airline> airlines;

	@JsonProperty("carr_flg")
	String carr_flg;

	@JsonProperty("airline_summary")
	String airlineSummary;

	@JsonProperty("brand")
	Brand brand;

	@JsonProperty("city_summary")
	String citySummary;

	@JsonProperty("dept_city")
	City deptCity;

	@JsonProperty("hotel")
	List<Hotel> hotels;

	@JsonProperty("hotel_summary")
	String hotelSummary;

	@JsonProperty("kodawari")
	List<Kodawari> kodawaris;

	@JsonProperty("price")
	Price price;

	@JsonProperty("sche")
	List<Sche> sches;

	@JsonProperty("urls")
	Urls urls;

	@JsonProperty("theme")
	List<Theme> themes;

	@JsonProperty("img")
	List<Urls> img;

	@JsonProperty("osusume")
	Osusume osusume;

	@JsonProperty("dest")
	City dest;

	@JsonProperty("seat_class")
	SeatClass seatClass;

	@JsonProperty("pex_flg")
	String pex_flg;

	@JsonProperty("kwic")
	String kwic;

}
