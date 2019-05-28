package com.example.spring.webapi.abroadair.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.abroadair.v1.request.TicketRequest;
import com.example.spring.webapi.abroadair.v1.responce.TicketResponse;

@Service
public class Ticket
		extends ApiBase<TicketRequest, TicketResponse> {

	@Override
	protected Class<TicketResponse> type() {
		return TicketResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getAbroadair().getTicket();
	}
}
