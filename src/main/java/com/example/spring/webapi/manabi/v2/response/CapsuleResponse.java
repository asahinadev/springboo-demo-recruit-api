package com.example.spring.webapi.manabi.v2.response;

import java.util.List;

import com.example.spring.common.rest.ResponseType;
import com.example.spring.webapi.manabi.v2.response.entity.Capsule;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CapsuleResponse extends ResponseType<CapsuleResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("capsule")
		List<Capsule> capsules;

	}
}
