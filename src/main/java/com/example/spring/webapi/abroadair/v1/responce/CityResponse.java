package com.example.spring.webapi.abroadair.v1.responce;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.webapi.abroadair.v1.responce.entity.City;
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