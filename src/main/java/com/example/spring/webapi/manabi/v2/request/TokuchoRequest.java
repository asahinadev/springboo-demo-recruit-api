package com.example.spring.webapi.manabi.v2.request;

import com.example.spring.common.RequestType;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.manabi.v2.values.SchoolType;
import com.example.spring.webapi.manabi.v2.values.TokuchoType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class TokuchoRequest extends RequestType {

	@JsonProperty("tokucho_type")
	TokuchoType tokuchoType;

	@JsonProperty("tktg_type")
	SchoolType tktgType;

	@JsonProperty("pickup")
	YesAny pickup;

}
