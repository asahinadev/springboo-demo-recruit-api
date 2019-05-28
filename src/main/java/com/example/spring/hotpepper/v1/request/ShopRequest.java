package com.example.spring.hotpepper.v1.request;

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
public class ShopRequest extends RequestType {

	@JsonProperty("keyword")
	String keyword;
	@JsonProperty("tel")
	String tel;

}
