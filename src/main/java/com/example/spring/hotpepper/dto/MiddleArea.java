package com.example.spring.hotpepper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MiddleArea {
	String name;
	String code;
	LargeArea large_area;
	ServiceArea service_area;
	LargeServiceArea large_service_area;
}
