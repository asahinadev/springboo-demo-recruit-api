package com.example.spring.manabi.response.v2;

import java.util.List;

import com.example.spring.manabi.response.v2.sub.Area;
import com.example.spring.parts.ResponseType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class AreaResponse extends ResponseType<AreaResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("area")
		List<Area> areas;

	}
}
