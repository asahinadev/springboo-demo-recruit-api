package com.example.spring.hotpepper.responce.v1.sub;

import java.util.Map;

import com.example.spring.hotpepper.parts.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Shop extends ParameterBase {

	@JsonProperty("id")
	String id;

	@JsonProperty("name")
	String name;

	@JsonProperty("name_kana")
	String kana;

	@JsonProperty("genre")
	Genre genre;

	@JsonProperty("address")
	String address;

	@JsonProperty("urls")
	Map<String, String> urls;

	@JsonProperty("desc")
	String desc;
}
