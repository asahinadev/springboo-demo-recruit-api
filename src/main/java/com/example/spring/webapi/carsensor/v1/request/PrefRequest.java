package com.example.spring.webapi.carsensor.v1.request;

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
public class PrefRequest extends RequestType {

	@JsonProperty("code")
	List<String> codes;

	@JsonProperty("large_area")
	List<String> largeAreas;

}
