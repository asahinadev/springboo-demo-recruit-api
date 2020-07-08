package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.LargeArea;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class LargeAreaResponse
	extends CommonResponse<LargeAreaResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<LargeArea> large_area;
	}
}
