package com.example.spring.webapi.carsensor.v1.entity;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Pref extends MasterBase {

	@JsonProperty("large_area")
	LargeArea largeArea;
}
