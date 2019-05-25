package com.example.spring.hotpepper.responce.v1.sub;

import com.example.spring.parts.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Special extends MasterBase {

	@JsonProperty("title")
	String title;

	@JsonProperty("special_category")
	SpecialCategory specialCategory;

}
