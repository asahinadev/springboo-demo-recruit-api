package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.Budget;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class BudgetResponse
	extends CommonResponse<BudgetResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<Budget> budget;
	}
}
