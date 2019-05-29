package com.example.spring.webapi.abroadair.v1.responce.entity;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Country extends MasterBase {

	@JsonProperty("name_en")
	String nameEn;

	@JsonProperty("ticket_count")
	Integer count;

	@JsonProperty("area")
	Area area;
}
