package com.example.spring.hotpepper.dto;

import lombok.Data;

@Data
public class LargeArea {
	String name;
	String code;
	ServiceArea service_area;
	LargeServiceArea large_service_area;
}
