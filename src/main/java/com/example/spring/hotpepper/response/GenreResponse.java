package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.Genre;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class GenreResponse
	extends CommonResponse<GenreResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<Genre> genre;
	}
}
