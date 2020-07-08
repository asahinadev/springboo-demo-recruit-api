package com.example.spring.carsensor.request;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonRequest {

	public MultiValueMap<String, String> queries(String apiKey) {

		var queries = new LinkedMultiValueMap<String, String>();

		// 共通
		queries.set("key", apiKey);
		queries.set("format", "json");

		return queries;

	}

	protected boolean isNoneEmpty(List<String> list) {
		if (list == null) {
			log.trace("null");
			return false;
		}
		if (list.isEmpty()) {
			log.trace("empty");
			return false;
		}
		// 空白文字を除いてデータがあるか？
		return list.stream()
				.filter(StringUtils::isNotBlank)
				.findFirst()
				.isPresent();
	}

	protected void set(MultiValueMap<String, String> queries, String key, List<String> values) {
		if (isNoneEmpty(values)) {
			queries.set(key, String.join(",", values));
		}
	}

	protected void set(MultiValueMap<String, String> queries, String key, String values) {
		if (StringUtils.isNotBlank(values)) {
			queries.set(key, values);
		}
	}

	protected void set(MultiValueMap<String, String> queries, String key, int values) {
		if (values > 0) {
			queries.set(key, Integer.toString(values));
		}
	}

	protected void set(MultiValueMap<String, String> queries, String key, double values) {
		if (values != Double.NEGATIVE_INFINITY) {
			queries.set(key, Double.toString(values));
		}
	}

	@SneakyThrows
	@Override
	public String toString() {
		return new ObjectMapper().writeValueAsString(this);
	}
}
