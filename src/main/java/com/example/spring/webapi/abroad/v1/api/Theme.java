package com.example.spring.webapi.abroad.v1.api;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.example.spring.common.rest.ApiBase;
import com.example.spring.webapi.abroad.v1.request.ThemeRequest;
import com.example.spring.webapi.abroad.v1.responce.ThemeResponse;

@Service
public class Theme
		extends ApiBase<ThemeRequest, ThemeResponse> {

	@Override
	protected URI uri() {

		return config.getAbroad().getTheme();
	}

}
