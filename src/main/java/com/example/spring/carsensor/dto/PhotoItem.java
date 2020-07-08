package com.example.spring.carsensor.dto;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PhotoItem {
	String caption;
	URI l;
	URI m;
	URI s;
	URI mobile;
	URI pc;
	URI qr;
}
