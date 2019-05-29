package com.example.spring.webapi.abroad.v1.entity;

import com.example.spring.common.entity.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class OilSurcharge extends ParameterBase {

	@JsonProperty("include")
	String include;

	@JsonProperty("summary")
	Price summary;

}
