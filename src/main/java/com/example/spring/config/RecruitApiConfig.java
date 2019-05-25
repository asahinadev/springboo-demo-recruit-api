package com.example.spring.config;

import java.net.URI;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Configuration
@ConfigurationProperties(prefix = "recruit-api")
public class RecruitApiConfig {

	String key;

	Hotpepper hotpepper;

	@Data
	public static class Hotpepper {
		URI gourmet;
		URI shop;
		URI budget;
		URI largeServiceArea;
		URI serviceArea;
		URI largeArea;
		URI middleArea;
		URI smallArea;
		URI genre;
		URI creditCard;
		URI special;
		URI specialCategory;
	}

}
