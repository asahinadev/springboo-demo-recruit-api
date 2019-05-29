package com.example.spring.webapi.abroad.v1.entity;

import com.example.spring.common.entity.MasterBase;
import com.example.spring.common.entity.Urls;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Spot extends MasterBase {

	@JsonProperty("name_en")
	String nameEn;

	@JsonProperty("title")
	String title;

	@JsonProperty("description")
	String description;

	@JsonProperty("lat")
	Double lat;

	@JsonProperty("lng")
	Double lng;

	@JsonProperty("map_scale")
	Long scale;

	@JsonProperty("area")
	Area area;

	@JsonProperty("country")
	Country country;

	@JsonProperty("city")
	City city;

	@JsonProperty("url")
	Urls url;
}
