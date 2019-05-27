package com.example.spring.manabi.request.v2;

import java.util.List;

import com.example.spring.common.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CategoryRequest extends RequestType {

	@JsonProperty("genre")
	List<String> genres;
	@JsonProperty("category")
	List<String> categories;

}
