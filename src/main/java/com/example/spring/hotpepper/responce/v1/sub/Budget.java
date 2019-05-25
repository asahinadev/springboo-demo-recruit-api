package com.example.spring.hotpepper.responce.v1.sub;

import com.example.spring.hotpepper.parts.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Budget extends MasterBase {

	@JsonProperty("average")
	String average;
}
