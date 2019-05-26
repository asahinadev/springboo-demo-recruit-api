package com.example.spring.manabi.response.v2.sub;

import com.example.spring.manabi.values.MapDisp;
import com.example.spring.parts.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class City extends MasterBase {

	@JsonProperty("map_disp")
	MapDisp mapDisp = MapDisp.DISP;

	@JsonProperty("prefecture")
	Prefecture prefecture;
}