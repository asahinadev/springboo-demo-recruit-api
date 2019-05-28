package com.example.spring.webapi.manabi.v2.response.entity;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class TokuchoGroup extends MasterBase {

	@JsonProperty("tokucho_comment")
	String tokuchoComment;

	@JsonProperty("tokucho_list")
	TokuchoList tokuchoList;
}
