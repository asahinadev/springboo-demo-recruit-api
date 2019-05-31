package com.example.spring.webapi.abroadair.v1.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import com.example.spring.ApiTest;
import com.example.spring.common.values.Order;
import com.example.spring.webapi.abroadair.v1.request.TicketRequest;
import com.example.spring.webapi.abroadair.v1.responce.TicketResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@ActiveProfiles("test")
@ComponentScan()
@RunWith(Parameterized.class)
@SpringBootTest
public class TicketTest
		extends ApiTest<Ticket, TicketRequest, TicketResponse> {

	@Parameterized.Parameters
	public static List<TicketRequest> data() {

		List<TicketRequest> list = new ArrayList<>();

		list.add(TicketRequest.of().ids($("9")).build());
		list.add(TicketRequest.of().areas($("EUR")).build());
		list.add(TicketRequest.of().zones($("BC2")).build());
		list.add(TicketRequest.of().countries($("BE")).build());
		list.add(TicketRequest.of().cities($("NY")).build());
		list.add(TicketRequest.of().keyword("ベトナム").build());
		list.add(TicketRequest.of().keywordOr($("ベトナム")).build());
		list.add(TicketRequest.of().keyword("ベトナム").depts($("TYO")).build());
		list.add(TicketRequest.of().deptDetails($("HND")).build());
		list.add(TicketRequest.of().month(201809).build());
		list.add(TicketRequest.of().date(20180915).build());
		list.add(TicketRequest.of().keyword("ベトナム").priceMin(200000).build());
		list.add(TicketRequest.of().keyword("ベトナム").priceMax(200000).build());
		list.add(TicketRequest.of().keyword("ベトナム").termMin(20).build());
		list.add(TicketRequest.of().keyword("ベトナム").termMax(20).build());
		list.add(TicketRequest.of().keyword("ベトナム").seatClass($("0")).build());
		list.add(TicketRequest.of().keyword("ベトナム").seatClass($("1")).build());
		list.add(TicketRequest.of().keyword("ベトナム").seatClass($("2")).build());
		list.add(TicketRequest.of().keyword("ベトナム").seatClass($("3")).build());
		list.add(TicketRequest.of().keyword("ベトナム").seatClass($("4")).build());
		list.add(TicketRequest.of().keyword("ベトナム").deptTime($("0")).build());
		list.add(TicketRequest.of().keyword("ベトナム").deptTime($("1")).build());
		list.add(TicketRequest.of().keyword("ベトナム").deptTime($("2")).build());
		list.add(TicketRequest.of().keyword("ベトナム").deptTime($("3")).build());
		list.add(TicketRequest.of().keyword("ベトナム").tripType($("0")).build());
		list.add(TicketRequest.of().keyword("ベトナム").tripType($("1")).build());
		list.add(TicketRequest.of().keyword("ベトナム").tripType($("2")).build());
		list.add(TicketRequest.of().keyword("ベトナム").tripType($("3")).build());
		list.add(TicketRequest.of().keyword("ベトナム").tripType($("4")).build());
		list.add(TicketRequest.of().airline($("AO")).build());
		list.add(TicketRequest.of().kodaw($("1")).build());
		for (Order order : Order.aproadaireValues()) {
			list.add(TicketRequest.of().keyword("ベトナム").order(order).build());
		}
		return list;

	}

	final TicketRequest parameter;

	@Autowired
	Ticket api;

	@Override
	protected Ticket api() {

		return api;
	}

	@Override
	protected Logger logger() {

		return log;
	}

	@Override
	protected void setParameter() {

		request = parameter;
		request.setKey(config.getKey());
	}

}
