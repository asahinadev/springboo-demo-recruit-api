package com.example.spring.webapi.abroadair.v1.responce.entity;

import java.util.List;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class City extends MasterBase {

	@JsonProperty("ticket_count")
	Integer count;

	@JsonProperty("tour_city")
	List<TourCity> tourCities;

	@JsonProperty("area")
	Area area;

	@JsonProperty("country")
	Country country;

	@JsonProperty("zone")
	Zone zone;

	@JsonProperty("nonstop")
	String nonstop;

}
