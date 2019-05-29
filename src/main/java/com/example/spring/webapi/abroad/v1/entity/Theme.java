package com.example.spring.webapi.abroad.v1.entity;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Theme extends MasterBase {

	@JsonProperty("tour_count")
	Long count;

	@JsonProperty("category")
	Category category;

	@JsonProperty("group")
	Group group;
}
