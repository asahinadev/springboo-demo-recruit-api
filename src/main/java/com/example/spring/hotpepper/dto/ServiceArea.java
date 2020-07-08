package com.example.spring.hotpepper.dto;

import lombok.Data;

@Data
public class ServiceArea {
	String name;
	String code;
	LargeServiceArea large_service_area;
}
