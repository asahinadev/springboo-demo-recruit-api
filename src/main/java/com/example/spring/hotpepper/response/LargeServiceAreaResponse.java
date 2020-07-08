package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.LargeServiceArea;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class LargeServiceAreaResponse
	extends CommonResponse<LargeServiceAreaResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<LargeServiceArea> large_service_area;
	}
}
