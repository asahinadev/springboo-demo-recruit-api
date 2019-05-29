package com.example.spring.webapi.abroad.v1.entity;

import java.util.List;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Osusume extends MasterBase {

	@JsonProperty("tour_count")
	Long count;

	@JsonProperty("report")
	List<Report> reports;

}
