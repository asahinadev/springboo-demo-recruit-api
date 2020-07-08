package com.example.spring.hotpepper.dto;

import java.net.URI;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Shop {
	String name;
	String name_kana;
	String address;
	Genre genre;
	Map<String, URI> urls;
	int desc;
	String id;
}
