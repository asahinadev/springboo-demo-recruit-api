package com.example.spring.manabi.v2.request;

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
public class CapsuleRequest extends RequestType {

	@JsonProperty("genre")
	List<String> genres;
	@JsonProperty("category")
	List<String> categories;
	@JsonProperty("capsule")
	List<String> capsules;

}