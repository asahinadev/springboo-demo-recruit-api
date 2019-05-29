package com.example.spring.webapi.manabi.v2.response;

import java.util.List;

import com.example.spring.common.rest.ResponseType;
import com.example.spring.webapi.manabi.v2.response.entity.Station;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class StationResponse extends ResponseType<StationResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("station")
		List<Station> stations;

	}
}
