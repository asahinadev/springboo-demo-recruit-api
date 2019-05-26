package com.example.spring.manabi.response.v2.sub;

import com.example.spring.parts.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Capsule extends MasterBase {

	@JsonProperty("category")
	Category category;

	@JsonProperty("capsule_type")
	String capsuleType;

	@JsonProperty("shikaku_type")
	String shikakuType;
}