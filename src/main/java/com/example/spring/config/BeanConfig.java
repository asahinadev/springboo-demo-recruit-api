package com.example.spring.config;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

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
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.ClientResponseWrapper;

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
	public WebClient hotpepper(DecoderHttpMessageReader<?> jsonReader) {

		return WebClient.builder()
				.baseUrl("http://webservice.recruit.co.jp/hotpepper/")
				.defaultHeader(
						HttpHeaders.ACCEPT,
						MediaType.APPLICATION_JSON_VALUE,
						"text/javascript;charset=UTF-8"//
				)
				.exchangeStrategies(new ExchangeStrategies() {
					@Override
					public List<HttpMessageReader<?>> messageReaders() {
						return Arrays.asList(jsonReader);
					}

					@Override
					public List<HttpMessageWriter<?>> messageWriters() {
						return Arrays.asList(new FormHttpMessageWriter());
					}
				}).build();
	}

	static class CustomClientResponse extends ClientResponseWrapper {

		CustomClientResponse(ClientResponse response) {
			super(response);
		}

		class CustomHeaders implements ClientResponse.Headers {

			@Override
			public OptionalLong contentLength() {
				return response().headers().contentLength();
			}

			@Override
			public Optional<MediaType> contentType() {
				return Optional.of(MediaType.APPLICATION_JSON);
			}

			@Override
			public List<String> header(String headerName) {
				return response().headers().header(headerName);
			}

			@Override
			public HttpHeaders asHttpHeaders() {
				var headers = response().headers().asHttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				return headers;
			}

		}

		public Headers headers() {
			return new CustomHeaders();
		}
	}
}