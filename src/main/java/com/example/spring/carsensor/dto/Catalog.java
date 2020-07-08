package com.example.spring.carsensor.dto;

import java.net.URI;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Catalog {
	Brand brand;
	String model;
	String grade;
	int price;
	String desc;
	Body body;
	int person;
	String period;
	String series;
	int width;
	int height;
	int length;
	Map<String, PhotoItem> photo;
	Map<String, URI> urls;

}
