package com.example.spring.hotpepper.responce.v1.sub;

import com.example.spring.hotpepper.parts.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Genre extends MasterBase {

	@JsonProperty("catch")
	String catchcopy;
}
