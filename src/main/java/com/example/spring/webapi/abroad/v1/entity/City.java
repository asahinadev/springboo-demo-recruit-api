package com.example.spring.webapi.abroad.v1.entity;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class City extends MasterBase {

	@JsonProperty("name_en")
	String nameEn;

	@JsonProperty("tour_count")
	Long count;

	@JsonProperty("lat")
	Double lat;

	@JsonProperty("lng")
	Double lng;

	@JsonProperty("area")
	Area area;

	@JsonProperty("country")
	Country country;
}
