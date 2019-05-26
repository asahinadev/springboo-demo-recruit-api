package com.example.spring.manabi.response.v2.sub;

import com.example.spring.parts.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Category extends MasterBase {

	@JsonProperty("genre")
	Genre genre;
}