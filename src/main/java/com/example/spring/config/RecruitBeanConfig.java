package com.example.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@Configuration
public class RecruitBeanConfig {

	@Autowired
	RecruitApiConfig config;

	@Bean
	public WebClient hotpepper() {

		return WebClient.builder()
				.baseUrl("http://webservice.recruit.co.jp/hotpepper/")
				.build();

	}
}