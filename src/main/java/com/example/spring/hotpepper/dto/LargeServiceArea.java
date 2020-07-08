package com.example.spring.hotpepper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LargeServiceArea {
	String name;
	String code;
}
