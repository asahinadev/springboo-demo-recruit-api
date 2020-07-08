package com.example.spring.hotpepper.dto;

import lombok.Data;

@Data
public class Special {
	String code;
	String name;
	SpecialCategory special_category;
}
