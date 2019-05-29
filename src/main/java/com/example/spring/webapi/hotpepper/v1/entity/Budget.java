package com.example.spring.webapi.hotpepper.v1.entity;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Budget extends MasterBase {

	@JsonProperty("average")
	String average;
}
