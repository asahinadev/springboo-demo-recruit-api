package com.example.spring.manabi.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.manabi.request.v2.GenreRequest;
import com.example.spring.manabi.response.v2.GenreResponse;
import com.example.spring.parts.ApiBase;

@Service
public class Genre
		extends ApiBase<GenreRequest, GenreResponse> {

	@Override
	protected Class<GenreResponse> type() {
		return GenreResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getManabi().getGenre();
	}
}
