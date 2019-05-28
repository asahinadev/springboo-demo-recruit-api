package com.example.spring.manabi.v2.response;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.manabi.v2.response.entity.CapsuleType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CapsuleTypeResponse extends ResponseType<CapsuleTypeResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("capsule_type")
		List<CapsuleType> capsuleTypes;

	}
}
