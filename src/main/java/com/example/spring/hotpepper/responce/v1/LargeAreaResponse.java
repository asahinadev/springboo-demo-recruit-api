package com.example.spring.hotpepper.responce.v1;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.hotpepper.responce.v1.entity.LargeArea;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class LargeAreaResponse extends ResponseType<LargeAreaResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("large_area")
		List<LargeArea> largeAreas;

	}

}
