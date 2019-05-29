package com.example.spring.webapi.abroad.v1.entity;

import com.example.spring.common.entity.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Sche extends ParameterBase {

	@JsonProperty("day")
	Integer day;

	@JsonProperty("city")
	City city;
}
