package com.example.spring.hotpepper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Genre {
	String name;
	String code;

	@JsonProperty("catch")
	String catchcopy;
}
