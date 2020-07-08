package com.example.spring.carsensor.response;

import java.util.List;

import com.example.spring.carsensor.dto.Color;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class ColorResponse
	extends CommonResponse<ColorResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<Color> color;
	}
}
