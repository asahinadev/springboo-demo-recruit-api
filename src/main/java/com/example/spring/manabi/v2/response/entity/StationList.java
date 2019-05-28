package com.example.spring.manabi.v2.response.entity;

import java.util.List;

import com.example.spring.common.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class StationList extends ParameterBase {

	@JsonProperty("station")
	List<Station> stations;
}
