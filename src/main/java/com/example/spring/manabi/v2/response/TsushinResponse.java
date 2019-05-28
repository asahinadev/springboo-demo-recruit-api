package com.example.spring.manabi.v2.response;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.manabi.v2.response.entity.Kouza;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class TsushinResponse extends ResponseType<TsushinResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("kouza")
		List<Kouza> kouza;

	}
}
