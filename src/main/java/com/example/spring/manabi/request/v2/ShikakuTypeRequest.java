package com.example.spring.manabi.request.v2;

import java.util.List;

import com.example.spring.common.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class ShikakuTypeRequest extends RequestType {

	@JsonProperty("shikaku_type")
	List<String> shikakuTypes;

}
