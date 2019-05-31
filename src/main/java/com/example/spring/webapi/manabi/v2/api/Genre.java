package com.example.spring.webapi.manabi.v2.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.manabi.v2.request.GenreRequest;
import com.example.spring.webapi.manabi.v2.response.GenreResponse;

@Service
public class Genre
		extends ApiBase<GenreRequest, GenreResponse> {

	@Override
	protected URI uri() {

		return config.getManabi().getGenre();
	}
}
