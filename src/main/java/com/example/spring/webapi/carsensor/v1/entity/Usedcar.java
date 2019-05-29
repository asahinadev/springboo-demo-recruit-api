package com.example.spring.webapi.carsensor.v1.entity;

import java.util.List;

import com.example.spring.common.entity.MasterBase;
import com.example.spring.common.entity.Urls;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Usedcar extends MasterBase {

	@JsonProperty("id")
	String id;

	@JsonProperty("brand")
	Brand brand;

	@JsonProperty("model")
	String model;

	@JsonProperty("grade")
	String grade;

	@JsonProperty("price")
	String price;

	@JsonProperty("inspection")
	String inspection;

	@JsonProperty("maintenance")
	String maintenance;

	@JsonProperty("warranty")
	String warranty;

	@JsonProperty("recycle")
	String recycle;

	@JsonProperty("engine")
	String engine;

	@JsonProperty("desc")
	String desc;

	@JsonProperty("body")
	Body body;

	@JsonProperty("odd")
	String odd;

	@JsonProperty("year")
	String year;

	@JsonProperty("shop")
	Shop shop;

	@JsonProperty("color")
	String color;

	@JsonProperty("maintenance_comment")
	String maintenanceComment;

	@JsonProperty("maintenance_fee")
	String maintenanceFee;

	@JsonProperty("photo")
	Photo photo;

	@JsonProperty("sub_img")
	List<Urls> subImg;

	@JsonProperty("urls")
	Urls urls;

	@JsonProperty("warranty_comment")
	String warrantyComment;

	@JsonProperty("warranty_distance")
	String warrantyDistance;

	@JsonProperty("warranty_length")
	String warrantyLength;

	@JsonProperty("warranty_fee")
	String warrantyFee;

}
