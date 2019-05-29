package com.example.spring.webapi.manabi.v2.response.entity;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Capsule extends MasterBase {

	@JsonProperty("category")
	Category category;

	@JsonProperty("capsule_type")
	@JsonDeserialize(using = CapsuleType.Deserializer.class)
	CapsuleType capsuleType;

	@JsonProperty("shikaku_type")
	@JsonDeserialize(using = ShikakuType.Deserializer.class)
	ShikakuType shikakuType;

	@JsonProperty("sub_capsule")
	SubCapsule subCapsule;

}
