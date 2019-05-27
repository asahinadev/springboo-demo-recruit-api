package com.example.spring.manabi.response.v2.sub;

import java.util.Map;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Urls extends MasterBase {

	@JsonProperty("caption")
	String caption;

	@JsonAnySetter
	Map<String, String> urls;
}
