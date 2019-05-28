package com.example.spring.webapi.abroadair.v1.responce.entity;

import com.example.spring.common.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Price extends ParameterBase {

	@JsonProperty("min")
	Integer min;
	@JsonProperty("max")
	Integer max;
	@JsonProperty("commission")
	Integer commission;
	@JsonProperty("all_month")
	Price allMonth;

}
