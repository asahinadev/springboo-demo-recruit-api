package com.example.spring.webapi.manabi.v2.response;

import java.util.List;

import com.example.spring.common.rest.ResponseType;
import com.example.spring.webapi.manabi.v2.response.entity.Prefecture;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class PrefectureResponse extends ResponseType<PrefectureResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("prefecture")
		List<Prefecture> prefectures;

	}
}
