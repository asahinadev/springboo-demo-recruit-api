package com.example.spring.webapi.hotpepper.v1.responce.entity;

import com.example.spring.common.entity.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class ServiceArea extends MasterBase {

	@JsonProperty("large_service_area")
	LargeServiceArea largeServiceArea;

}
