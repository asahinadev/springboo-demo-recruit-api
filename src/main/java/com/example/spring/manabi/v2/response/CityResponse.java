package com.example.spring.manabi.v2.response;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.manabi.v2.response.entity.City;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CityResponse extends ResponseType<CityResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("city")
		List<City> cities;

	}
}
