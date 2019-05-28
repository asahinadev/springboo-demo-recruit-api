package com.example.spring.webapi.hotpepper.v1.responce.entity;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Genre extends MasterBase {

	@JsonProperty("catch")
	String catchcopy;
}
