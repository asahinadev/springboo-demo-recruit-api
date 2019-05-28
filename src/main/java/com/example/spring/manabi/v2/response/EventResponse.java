package com.example.spring.manabi.v2.response;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.manabi.v2.response.entity.Event;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class EventResponse extends ResponseType<EventResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("event")
		List<Event> events;

	}
}