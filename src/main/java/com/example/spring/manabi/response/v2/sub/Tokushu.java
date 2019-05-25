package com.example.spring.manabi.response.v2.sub;

import com.example.spring.parts.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Tokushu extends MasterBase {

	@JsonProperty("sub_title")
	String subTitle;

	@JsonProperty("kikaku_cd")
	String kikakuCd;

	@JsonProperty("sort")
	Integer sort;
}
