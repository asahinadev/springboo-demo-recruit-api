package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.Special;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("results")
public class SpecialResponse {

	@JsonProperty("api_version")
	String version;

	@JsonProperty("results_available")
	Integer available;

	@JsonProperty("results_returned")
	Integer returned;

	@JsonProperty("results_start")
	Integer start;

	@JsonProperty("special")
	List<Special> results;

}
