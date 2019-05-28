package com.example.spring.manabi.response.v2.entity;

import com.example.spring.common.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Profile extends ParameterBase {

	@JsonProperty("photo")
	@JsonDeserialize(using = Urls.Deserializer.class)
	Urls photo;

	@JsonProperty("title")
	String title;

	@JsonProperty("read")
	String read;

	@JsonProperty("graduates")
	String graduates;

	@JsonProperty("comment")
	String comment;

	@JsonProperty("point")
	Point point;
}
