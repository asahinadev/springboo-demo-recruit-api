package com.example.spring.carsensor.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Usedcar {
	String id;
	Brand brand;
	String model;
	String grade;
	int price;
	String inspection;
	String maintenance;
	String warranty;
	String recycle;
	String engine;
	String desc;
	Body body;
	String odd;
	int year;
	Shop shop;
	String color;
	String maintenance_comment;
	String maintenance_fee;
	Photo photo;
	List<PhotoItem> sub_img;
	PhotoItem urls;
	String warranty_comment;
	String warranty_distance;
	String warranty_length;
	String warranty_fee;
}
