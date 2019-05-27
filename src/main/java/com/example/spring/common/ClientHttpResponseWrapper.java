package com.example.spring.common;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class ClientHttpResponseWrapper
		implements ClientHttpResponse {

	byte[] body;

	final ClientHttpResponse response;

	public HttpHeaders getHeaders() {
		return response.getHeaders();
	}

	public InputStream getBody() throws IOException {
		if (body == null) {
			this.body = StreamUtils.copyToByteArray(this.response.getBody());
		}
		return new ByteArrayInputStream(body);
	}

	@SneakyThrows
	public String getBodyText() {
		getBody();
		return new String(body);
	}

	public HttpStatus getStatusCode() throws IOException {
		return response.getStatusCode();
	}

	public int getRawStatusCode() throws IOException {
		return response.getRawStatusCode();
	}

	public String getStatusText() throws IOException {
		return response.getStatusText();
	}

	public void close() {
		response.close();
	}

}