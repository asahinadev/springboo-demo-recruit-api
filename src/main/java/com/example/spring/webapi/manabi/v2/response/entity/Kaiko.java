package com.example.spring.webapi.manabi.v2.response.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Kaiko extends Datetime {

	@JsonProperty("wday")
	String wday;

	@JsonProperty("start_time")
	String startTime;

	@JsonProperty("end_time")
	String endTime;
}
