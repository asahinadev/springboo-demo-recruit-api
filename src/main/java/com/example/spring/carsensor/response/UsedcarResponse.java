package com.example.spring.carsensor.response;

import java.util.List;

import com.example.spring.carsensor.dto.Usedcar;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class UsedcarResponse
	extends CommonResponse<UsedcarResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<Usedcar> usedcar;
	}
}
