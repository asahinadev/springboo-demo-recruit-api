package com.example.spring.hotpepper.responce.v1.sub;

import com.example.spring.common.MasterBase;
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
