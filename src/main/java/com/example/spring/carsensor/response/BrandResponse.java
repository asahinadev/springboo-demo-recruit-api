package com.example.spring.carsensor.response;

import java.util.List;

import com.example.spring.carsensor.dto.Brand;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class BrandResponse
	extends CommonResponse<BrandResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<Brand> brand;
	}
}
