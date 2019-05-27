package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.manabi.request.v2.EventRequest;
import com.example.spring.manabi.response.v2.EventResponse;

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
