package com.example.spring.webapi.manabi.v2.response.entity;

import java.util.List;

import com.example.spring.common.entity.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class KaikoList extends ParameterBase {

	@JsonProperty("kaiko")
	List<Kaiko> kaikos;
}
