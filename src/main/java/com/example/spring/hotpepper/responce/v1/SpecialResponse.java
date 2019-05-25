package com.example.spring.hotpepper.responce.v1;

import java.util.List;

import com.example.spring.hotpepper.parts.ResponseType;
import com.example.spring.hotpepper.responce.v1.sub.Special;
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
