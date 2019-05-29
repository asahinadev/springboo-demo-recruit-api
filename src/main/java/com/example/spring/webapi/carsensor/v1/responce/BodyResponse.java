package com.example.spring.webapi.carsensor.v1.responce;

import java.util.List;

import com.example.spring.common.rest.ResponseType;
import com.example.spring.webapi.carsensor.v1.responce.entity.Body;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class BodyResponse extends ResponseType<BodyResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("body")
		List<Body> bodies;

	}

}
