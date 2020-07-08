package com.example.spring.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.codec.DecoderHttpMessageReader;
import org.springframework.http.codec.FormHttpMessageWriter;
import org.springframework.http.codec.HttpMessageReader;
import org.springframework.http.codec.HttpMessageWriter;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.netty.handler.codec.UnsupportedMessageTypeException;

@Component
@Configuration
public class BeanConfig {

	@Autowired
	ApiConfig config;

	UnsupportedMessageTypeException x;

	MediaType JAVA_SCRIPT_UTF8 = MediaType.valueOf("text/javascript;charset=UTF-8");

	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper om = new ObjectMapper();
		om.enable(SerializationFeature.WRAP_ROOT_VALUE);
		return om;
	}

	@Bean
	public Jackson2JsonDecoder jsonDecoder(ObjectMapper objectMapper) {
		return new Jackson2JsonDecoder(objectMapper, MediaType.APPLICATION_JSON, JAVA_SCRIPT_UTF8);
	}

	@Bean
	public DecoderHttpMessageReader<?> jsonReader(Jackson2JsonDecoder jsonDecoder) {
		return new DecoderHttpMessageReader<>(jsonDecoder);
	}

	@Bean
	public ExchangeStrategies jsonExchangeStrategies(DecoderHttpMessageReader<?> jsonReader) {
		return new ExchangeStrategies() {
			@Override
			public List<HttpMessageReader<?>> messageReaders() {
				return Arrays.asList(jsonReader);
			}

			@Override
			public List<HttpMessageWriter<?>> messageWriters() {
				return Arrays.asList(new FormHttpMessageWriter());
			}
		};
	}

	@Bean
	public WebClient hotpepper(ExchangeStrategies jsonExchangeStrategies) {

		return WebClient.builder()
				.baseUrl("http://webservice.recruit.co.jp/hotpepper/")
				.defaultHeader(HttpHeaders.ACCEPT,
						MediaType.APPLICATION_JSON_VALUE, "text/javascript;charset=UTF-8")
				.exchangeStrategies(jsonExchangeStrategies).build();
	}

	@Bean
	public WebClient carsensor(ExchangeStrategies jsonExchangeStrategies) {

		return WebClient.builder()
				.baseUrl("http://webservice.recruit.co.jp/carsensor/")
				.defaultHeader(HttpHeaders.ACCEPT,
						MediaType.APPLICATION_JSON_VALUE, "text/javascript;charset=UTF-8")
				.exchangeStrategies(jsonExchangeStrategies).build();
	}
}