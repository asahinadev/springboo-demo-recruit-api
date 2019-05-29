package com.example.spring.webapi.carsensor.v1.responce.entity;

import java.util.List;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Photo extends MasterBase {

	@JsonProperty("front")
	Urls front;

	@JsonProperty("rear")
	Urls rear;

	@JsonProperty("inpane")
	Urls inpane;

	@JsonProperty("main")
	Urls main;

	@JsonProperty("sub")
	List<String> sub;

}
