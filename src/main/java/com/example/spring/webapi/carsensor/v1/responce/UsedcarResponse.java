package com.example.spring.webapi.carsensor.v1.responce;

import java.util.List;

import com.example.spring.common.rest.ResponseType;
import com.example.spring.webapi.carsensor.v1.entity.Usedcar;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class UsedcarResponse extends ResponseType<UsedcarResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("usedcar")
		List<Usedcar> usedcars;

	}

}
