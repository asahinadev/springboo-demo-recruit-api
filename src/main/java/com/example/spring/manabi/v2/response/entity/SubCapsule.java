package com.example.spring.manabi.v2.response.entity;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class SubCapsule extends MasterBase {

	@JsonProperty("shikaku_type")
	@JsonDeserialize(using = ShikakuType.Deserializer.class)
	ShikakuType shikakuType;

	@JsonProperty("capsule")
	Capsule capsule;
}
