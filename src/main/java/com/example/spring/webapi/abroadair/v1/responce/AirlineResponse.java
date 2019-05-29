package com.example.spring.webapi.abroadair.v1.responce;

import java.util.List;

import com.example.spring.common.rest.ResponseType;
import com.example.spring.webapi.abroadair.v1.responce.entity.Airline;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class AirlineResponse extends ResponseType<AirlineResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("airline")
		List<Airline> airlines;

	}
}
