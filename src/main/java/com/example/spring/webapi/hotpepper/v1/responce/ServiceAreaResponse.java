package com.example.spring.webapi.hotpepper.v1.responce;

import java.util.List;

import com.example.spring.common.rest.ResponseType;
import com.example.spring.webapi.hotpepper.v1.entity.ServiceArea;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class ServiceAreaResponse extends ResponseType<ServiceAreaResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("service_area")
		List<ServiceArea> serviceAreas;

	}

}
