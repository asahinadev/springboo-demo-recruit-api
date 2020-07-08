package com.example.spring.carsensor.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Pref {
	String name;
	String code;
	LargeArea large_area;
}
