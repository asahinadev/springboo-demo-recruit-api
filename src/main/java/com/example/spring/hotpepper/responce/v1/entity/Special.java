package com.example.spring.hotpepper.responce.v1.entity;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Special extends MasterBase {

	@JsonProperty("title")
	String title;

	@JsonProperty("special_category")
	SpecialCategory specialCategory;

}
