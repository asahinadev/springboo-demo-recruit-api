package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.CreditCard;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class CreditCardResponse
	extends CommonResponse<CreditCardResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<CreditCard> credit_card;
	}
}
