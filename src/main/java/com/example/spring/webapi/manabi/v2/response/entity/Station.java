package com.example.spring.webapi.manabi.v2.response.entity;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Station extends MasterBase {

	@JsonProperty("facility_cd")
	String facilityCd;

	@JsonProperty("prefecture")
	Prefecture prefecture;

	@JsonProperty("city")
	City city;

	@JsonProperty("along")
	Along along;
}
