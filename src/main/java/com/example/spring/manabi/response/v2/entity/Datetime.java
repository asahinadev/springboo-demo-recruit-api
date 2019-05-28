package com.example.spring.manabi.response.v2.entity;

import com.example.spring.common.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Datetime
		extends ParameterBase {

	@JsonProperty("start")
	String start;

	@JsonProperty("end")
	String end;
}
