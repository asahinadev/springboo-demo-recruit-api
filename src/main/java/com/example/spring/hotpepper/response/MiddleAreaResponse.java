package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.MiddleArea;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class MiddleAreaResponse
	extends CommonResponse<MiddleAreaResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<MiddleArea> middle_area;
	}
}
