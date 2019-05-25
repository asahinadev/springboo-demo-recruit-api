package com.example.spring.hotpepper.responce.v1;

import java.util.List;

import com.example.spring.hotpepper.parts.ResponseType;
import com.example.spring.hotpepper.responce.v1.sub.Budget;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class BudgetResponse extends ResponseType<BudgetResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("budget")
		List<Budget> budgets;

	}

}
