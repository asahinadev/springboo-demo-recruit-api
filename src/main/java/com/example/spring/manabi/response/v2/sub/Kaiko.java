package com.example.spring.manabi.response.v2.sub;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Kaiko extends Datetime {

	@JsonProperty("wday")
	String wday;

}
