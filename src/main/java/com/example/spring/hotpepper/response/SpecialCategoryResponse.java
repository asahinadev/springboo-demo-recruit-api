package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.SpecialCategory;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class SpecialCategoryResponse
	extends CommonResponse<SpecialCategoryResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<SpecialCategory> special_category;
	}
}