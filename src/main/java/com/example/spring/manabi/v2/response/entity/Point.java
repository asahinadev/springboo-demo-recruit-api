package com.example.spring.manabi.v2.response.entity;

import com.example.spring.common.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Point extends ParameterBase {

	@JsonProperty("photo")
	@JsonDeserialize(using = Urls.Deserializer.class)
	Urls photo;

	@JsonProperty("read")
	String read;

	@JsonProperty("caption")
	String caption;

	@JsonProperty("title")
	String title;

	@JsonProperty("catch")
	String catchCopy;
}
