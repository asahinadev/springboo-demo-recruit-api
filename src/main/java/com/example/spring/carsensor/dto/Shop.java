package com.example.spring.carsensor.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Shop {
	String name;
	Pref pref;
	double lat;
	double lng;
	String datum;
}
