package com.example.spring.hotpepper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ServiceArea {
	String name;
	String code;
	LargeServiceArea large_service_area;
}
