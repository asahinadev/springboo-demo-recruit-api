package com.example.spring.webapi.abroadair.v1.entity;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class DeptDetail extends MasterBase {

	@JsonProperty("ticket_count")
	Integer count;

	@JsonProperty("dept")
	Dept dept;
}
