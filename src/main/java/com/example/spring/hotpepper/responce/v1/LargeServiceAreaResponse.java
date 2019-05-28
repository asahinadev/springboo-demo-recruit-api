package com.example.spring.hotpepper.responce.v1;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.hotpepper.responce.v1.entity.LargeServiceArea;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class LargeServiceAreaResponse extends ResponseType<LargeServiceAreaResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("large_service_area")
		List<LargeServiceArea> largeServiceAreas;

	}

}
