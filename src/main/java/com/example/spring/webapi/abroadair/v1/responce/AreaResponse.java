package com.example.spring.webapi.abroadair.v1.responce;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.webapi.abroadair.v1.responce.entity.Area;
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
