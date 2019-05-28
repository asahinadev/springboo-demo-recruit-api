package com.example.spring.webapi.carsensor.v1.responce.entity;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Catalog extends MasterBase {

	@JsonProperty("brand")
	Brand brand;
	@JsonProperty("model")
	String model;
	@JsonProperty("grade")
	String grade;
	@JsonProperty("price")
	String price;
	@JsonProperty("desc")
	String desc;
	@JsonProperty("body")
	Body body;
	@JsonProperty("person")
	String person;
	@JsonProperty("period")
	String period;
	@JsonProperty("series")
	String series;
	@JsonProperty("width")
	String width;
	@JsonProperty("height")
	String height;
	@JsonProperty("length")
	String length;
	@JsonProperty("photo")
	Photo photo;
	@JsonProperty("urls")
	Urls urls;

}
