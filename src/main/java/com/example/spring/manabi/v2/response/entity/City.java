package com.example.spring.manabi.v2.response.entity;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class City extends MasterBase {

	@JsonProperty("map_disp")
	String mapDisp;

	@JsonProperty("prefecture")
	Prefecture prefecture;
}
