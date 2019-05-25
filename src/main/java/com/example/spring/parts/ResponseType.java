package com.example.spring.parts;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public abstract class ResponseType<T extends ResponseType.Results>
		extends ParameterBase {

	@JsonProperty("results")
	T results;

	@Getter
	@Setter
	public static class Results extends ParameterBase {

		@JsonProperty("api_version")
		String apiVersion;

		@JsonProperty("results_returned")
		Long returned;

		@JsonProperty("results_start")
		Long start;

		@JsonProperty("results_available")
		Long available;

		@JsonProperty("error")
		Error error;
	}
}
