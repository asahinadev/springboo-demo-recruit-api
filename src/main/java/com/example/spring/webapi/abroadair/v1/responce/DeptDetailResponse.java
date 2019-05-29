package com.example.spring.webapi.abroadair.v1.responce;

import java.util.List;

import com.example.spring.common.rest.ResponseType;
import com.example.spring.webapi.abroadair.v1.entity.DeptDetail;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class DeptDetailResponse extends ResponseType<DeptDetailResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("dept_detail")
		List<DeptDetail> deptDetails;

	}

}
