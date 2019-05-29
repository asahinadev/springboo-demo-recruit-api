package com.example.spring.webapi.manabi.v2.response.entity;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Tokushu extends MasterBase {

	@JsonProperty("sub_title")
	String subTitle;

	@JsonProperty("kikaku_cd")
	String kikakuCd;

	@JsonProperty("sort")
	Integer sort;

	@JsonProperty("tokucho")
	@JsonDeserialize(using = Tokucho.Deserializer.class)
	Tokucho tokucho;

	@JsonProperty("catch")
	String catchCopy;
}
