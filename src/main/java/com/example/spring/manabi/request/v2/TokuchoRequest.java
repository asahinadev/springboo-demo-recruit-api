package com.example.spring.manabi.request.v2;

import com.example.spring.common.RequestType;
import com.example.spring.manabi.values.SchoolType;
import com.example.spring.manabi.values.TokuchoType;
import com.example.spring.values.Flag;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class TokuchoRequest extends RequestType {

	@JsonProperty("tokucho_type")
	TokuchoType tokuchoType;
	@JsonProperty("tktg_type")
	SchoolType tktgType;
	@JsonProperty("pickup")
	Flag pickup;

}
