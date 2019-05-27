package com.example.spring.manabi.response.v2.sub;

import com.example.spring.common.MasterBase;
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
