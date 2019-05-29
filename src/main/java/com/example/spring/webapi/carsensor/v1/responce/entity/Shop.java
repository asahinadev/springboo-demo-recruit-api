package com.example.spring.webapi.carsensor.v1.responce.entity;

import com.example.spring.common.MasterBase;
import com.example.spring.common.values.Datum;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Shop extends MasterBase {

	@JsonProperty("country")
	Country country;

	@JsonProperty("lat")
	Double lat;

	@JsonProperty("lng")
	Double lng;

	@JsonProperty("datum")
	Datum datum;

	@JsonProperty("pref")
	Pref pref;

}
