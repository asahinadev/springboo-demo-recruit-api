package com.example.spring.manabi.response.v2.entity;

import com.example.spring.common.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class News extends ParameterBase {

	@JsonProperty("photo")
	String photo;

	@JsonProperty("read")
	String read;

}
