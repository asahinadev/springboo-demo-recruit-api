package com.example.spring.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.v2.request.EventRequest;
import com.example.spring.manabi.v2.response.EventResponse;

@Service
public class Event
		extends ApiBase<EventRequest, EventResponse> {

	@Override
	protected Class<EventResponse> type() {
		return EventResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getEvent();
	}
}
