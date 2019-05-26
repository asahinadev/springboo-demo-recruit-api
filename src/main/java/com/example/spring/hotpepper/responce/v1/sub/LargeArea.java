package com.example.spring.hotpepper.responce.v1.sub;

import com.example.spring.parts.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class LargeArea extends MasterBase {

	@JsonProperty("service_area")
	ServiceArea serviceArea;

	@JsonProperty("large_service_area")
	LargeServiceArea largeServiceArea;

}
