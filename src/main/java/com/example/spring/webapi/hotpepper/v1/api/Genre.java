package com.example.spring.webapi.hotpepper.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.ApiBase;
import com.example.spring.webapi.hotpepper.v1.request.GenreRequest;
import com.example.spring.webapi.hotpepper.v1.responce.GenreResponse;

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
