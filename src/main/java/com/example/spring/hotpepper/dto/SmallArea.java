package com.example.spring.hotpepper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SmallArea {
	String name;
	String code;
	MiddleArea middle_area;
	LargeArea large_area;
	ServiceArea service_area;
	LargeServiceArea large_service_area;
}
