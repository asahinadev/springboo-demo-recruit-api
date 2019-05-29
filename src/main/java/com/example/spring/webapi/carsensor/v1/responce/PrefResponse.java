package com.example.spring.webapi.carsensor.v1.responce;

import java.util.List;

import com.example.spring.common.rest.ResponseType;
import com.example.spring.webapi.carsensor.v1.responce.entity.Pref;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class PrefResponse extends ResponseType<PrefResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("pref")
		List<Pref> prefs;

	}

}
