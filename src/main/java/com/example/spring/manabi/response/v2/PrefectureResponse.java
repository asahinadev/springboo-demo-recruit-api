package com.example.spring.manabi.response.v2;

import java.util.List;

import com.example.spring.manabi.response.v2.sub.Prefecture;
import com.example.spring.parts.ResponseType;
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