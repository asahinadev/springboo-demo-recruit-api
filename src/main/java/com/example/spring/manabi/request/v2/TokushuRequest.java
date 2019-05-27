package com.example.spring.manabi.request.v2;

import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.values.Flag;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class TokushuRequest extends RequestType {

	@JsonProperty("tokushu")
	List<String> tokushus;
	@JsonProperty("kikaku")
	List<String> kikakus;
	@JsonProperty("has_event")
	Flag event = Flag.ANY;

}
