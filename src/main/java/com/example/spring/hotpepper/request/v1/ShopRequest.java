package com.example.spring.hotpepper.request.v1;

import com.example.spring.common.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class ShopRequest extends RequestType {

	@JsonProperty("keyword")
	String keyword;
	@JsonProperty("tel")
	String tel;

}
