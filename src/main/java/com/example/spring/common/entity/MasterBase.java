package com.example.spring.common.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class MasterBase extends ParameterBase {

	@JsonProperty("code")
	String code;

	@JsonProperty("name")
	String name;

}
