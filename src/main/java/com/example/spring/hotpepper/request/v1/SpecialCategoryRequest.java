package com.example.spring.hotpepper.request.v1;

import java.util.List;

import com.example.spring.common.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class SpecialCategoryRequest extends RequestType {

	@JsonProperty("special_category")
	List<String> specialCategories;

}
