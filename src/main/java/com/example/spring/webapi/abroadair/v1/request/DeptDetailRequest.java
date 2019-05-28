package com.example.spring.webapi.abroadair.v1.request;

import java.util.List;

import com.example.spring.common.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class DeptDetailRequest extends RequestType {

	@JsonProperty("dept_detail")
	List<String> deptDetails;
	@JsonProperty("dept")
	List<String> depts;
	@JsonProperty("in_use")
	String inUse;

}
