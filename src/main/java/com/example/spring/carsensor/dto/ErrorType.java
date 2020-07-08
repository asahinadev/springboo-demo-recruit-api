package com.example.spring.carsensor.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ErrorType {
	String message;
	String code;
}
