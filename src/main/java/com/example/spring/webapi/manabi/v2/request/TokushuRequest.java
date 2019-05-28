package com.example.spring.webapi.manabi.v2.request;

import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.common.values.YesAny;
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
public class TokushuRequest extends RequestType {

	@JsonProperty("tokushu")
	List<String> tokushus;
	@JsonProperty("kikaku")
	List<String> kikakus;
	@JsonProperty("has_event")
	YesAny event;

}
