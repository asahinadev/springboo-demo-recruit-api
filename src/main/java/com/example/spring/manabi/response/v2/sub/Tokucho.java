package com.example.spring.manabi.response.v2.sub;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Tokucho extends MasterBase {

	@JsonProperty("tktg_type")
	String tktgType;

	@JsonProperty("pickup")
	String pickup;

	@JsonProperty("tokucho_type")
	String tokuchoType;

	@JsonProperty("tokucho_group")
	TokuchoGroup group;

}
