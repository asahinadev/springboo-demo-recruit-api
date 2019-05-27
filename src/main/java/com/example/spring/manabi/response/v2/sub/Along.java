package com.example.spring.manabi.response.v2.sub;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Along extends MasterBase {

	@JsonProperty("along_type")
	AlongType alongType;
}
