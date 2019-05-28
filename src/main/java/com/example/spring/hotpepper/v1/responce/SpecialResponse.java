package com.example.spring.hotpepper.v1.responce;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.hotpepper.v1.responce.entity.Special;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class SpecialResponse extends ResponseType<SpecialResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("special")
		List<Special> specials;

	}

}