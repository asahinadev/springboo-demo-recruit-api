package com.example.spring.manabi.request.v2;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.example.spring.manabi.values.Flag;
import com.example.spring.parts.RequestType;
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
	Flag event = Flag.A;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "tokushu", tokushus);
		add(map, "kikaku", kikakus);
		add(map, "has_event", event);

		return map;
	}

}
