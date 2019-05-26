package com.example.spring.manabi.response.v2.sub;

import com.example.spring.parts.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class SubCapsule extends MasterBase {

	@JsonProperty("shikaku_type")
	String shikakuType;

	@JsonProperty("capsule")
	Capsule capsule;
}
