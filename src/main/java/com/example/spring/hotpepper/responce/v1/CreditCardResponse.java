package com.example.spring.hotpepper.responce.v1;

import java.util.List;

import com.example.spring.hotpepper.responce.v1.sub.CreditCard;
import com.example.spring.parts.ResponseType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CreditCardResponse extends ResponseType<CreditCardResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("credit_card")
		List<CreditCard> creditCards;

	}
}
