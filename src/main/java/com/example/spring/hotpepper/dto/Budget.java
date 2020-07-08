package com.example.spring.hotpepper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Budget {
	String name;
	String code;
	String average;
}
