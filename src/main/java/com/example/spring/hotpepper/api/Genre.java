package com.example.spring.hotpepper.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.hotpepper.parts.ApiBase;
import com.example.spring.hotpepper.request.v1.GenreRequest;
import com.example.spring.hotpepper.responce.v1.GenreResponse;

@Service
public class Genre
		extends ApiBase<GenreRequest, GenreResponse> {

	@Override
	protected Class<GenreResponse> type() {
		return GenreResponse.class;
	}

	@Override
	protected URI uri() {
		return config.getHotpepper().getGenre();
	}
}
