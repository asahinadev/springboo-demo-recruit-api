package com.example.spring.manabi.response.v2.sub;

import java.util.List;

import com.example.spring.common.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class PointList extends ParameterBase {

	@JsonProperty("point")
	List<Point> points;
}
