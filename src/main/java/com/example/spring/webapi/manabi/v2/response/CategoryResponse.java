package com.example.spring.webapi.manabi.v2.response;

import java.util.List;

import com.example.spring.common.rest.ResponseType;
import com.example.spring.webapi.manabi.v2.response.entity.Category;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CategoryResponse extends ResponseType<CategoryResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("category")
		List<Category> categories;

	}
}
