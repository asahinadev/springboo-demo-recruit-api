package com.example.spring.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.config.RecruitApiConfig;
import com.example.spring.webapi.hotpepper.v1.api.LargeServiceArea;
import com.example.spring.webapi.hotpepper.v1.api.ServiceArea;
import com.example.spring.webapi.hotpepper.v1.request.LargeServiceAreaRequest;
import com.example.spring.webapi.hotpepper.v1.request.ServiceAreaRequest;
import com.example.spring.webapi.hotpepper.v1.responce.LargeServiceAreaResponse;
import com.example.spring.webapi.hotpepper.v1.responce.ServiceAreaResponse;

@RestController
@RequestMapping("/api/hotpepper")
public class Hotpepper {

	@Autowired
	protected RecruitApiConfig config;

	@Autowired
	LargeServiceArea largeServiceArea;

	@Autowired
	ServiceArea serviceArea;

	@PostMapping(path = "large-service-area")
	public LargeServiceAreaResponse.Results largeServiceArea(
			@RequestBody(required = false) LargeServiceAreaRequest request) {

		request.setKey(config.getKey());
		return largeServiceArea.accept(request).getResults();
	}

	@PostMapping(path = "service-area")
	public ServiceAreaResponse.Results serviceArea(
			@RequestBody(required = false) ServiceAreaRequest request) {

		request.setKey(config.getKey());
		return serviceArea.accept(request).getResults();
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionHandler(Exception exception) {

		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Error.class)
	public ResponseEntity<String> exceptionHandler(Error error) {

		return new ResponseEntity<>(error.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
