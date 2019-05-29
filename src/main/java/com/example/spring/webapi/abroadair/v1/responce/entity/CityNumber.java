package com.example.spring.webapi.abroadair.v1.responce.entity;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CityNumber extends MasterBase {

	@JsonProperty("number")
	String number;

	@JsonProperty("summary")
	String summary;

	@JsonProperty("open_jaw")
	String openJaw;

}
