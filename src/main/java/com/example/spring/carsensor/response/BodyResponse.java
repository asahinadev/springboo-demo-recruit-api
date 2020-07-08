package com.example.spring.carsensor.response;

import java.util.List;

import com.example.spring.carsensor.dto.Body;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class BodyResponse
	extends CommonResponse<BodyResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<Body> body;
	}
}
