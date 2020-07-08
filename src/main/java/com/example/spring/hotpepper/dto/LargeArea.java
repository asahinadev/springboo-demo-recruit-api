package com.example.spring.hotpepper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LargeArea {
	String name;
	String code;
	ServiceArea service_area;
	LargeServiceArea large_service_area;
}
