package com.example.spring.common;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Error extends ParameterBase {

	@JsonProperty("code")
	Integer code;

	@JsonProperty("message")
	String message;

	@JsonAnySetter
	Map<String, Object> any;
}
