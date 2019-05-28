package com.example.spring.webapi.manabi.v2.response;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.webapi.manabi.v2.response.entity.SubCapsule;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class SubCapsuleResponse extends ResponseType<SubCapsuleResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("sub_capsule")
		List<SubCapsule> subCapsules;

	}
}