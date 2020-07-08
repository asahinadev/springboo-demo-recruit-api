package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.SmallArea;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class SmallAreaResponse
	extends CommonResponse<SmallAreaResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<SmallArea> small_area;
	}
}
