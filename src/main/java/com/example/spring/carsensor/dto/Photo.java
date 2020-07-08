package com.example.spring.carsensor.dto;

import java.net.URI;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Photo {
	PhotoItem main;
	List<URI> sub;
}
