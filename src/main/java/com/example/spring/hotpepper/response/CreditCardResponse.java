package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.CreditCard;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("results")
public class CreditCardResponse {

	@JsonProperty("api_version")
	String version;

	@JsonProperty("results_available")
	Integer available;

	@JsonProperty("results_returned")
	Integer returned;

	@JsonProperty("results_start")
	Integer start;

	@JsonProperty("credit_card")
	List<CreditCard> results;

}
