package com.example.spring.webapi.abroad.v1.entity;

import com.example.spring.common.entity.ParameterBase;
import com.example.spring.common.entity.Urls;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Report extends ParameterBase {

	@JsonProperty("title")
	String title;

	@JsonProperty("img")
	Urls img;

}
