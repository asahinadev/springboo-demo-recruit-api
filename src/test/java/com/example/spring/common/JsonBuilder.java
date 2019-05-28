package com.example.spring.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;

public class JsonBuilder {

	public static JsonBuilder builder() {
		return new JsonBuilder();
	}

	Map<String, Object> map = new HashMap<>();

	private JsonBuilder() {
		// nop
	}

	public JsonBuilder set(String key, Object value) {
		map.put(key, value);
		return this;
	}

	@SuppressWarnings("unchecked")
	public JsonBuilder add(String key, Object... values) {
		Object temp;
		List<Object> list;
		if (map.containsKey(key)) {
			temp = map.get(key);
			if (!(temp instanceof List)) {
				list = new ArrayList<>();
			} else {
				list = (List<Object>) temp;
			}
			list.add(temp);
		} else {
			list = new ArrayList<>();
		}
		for (Object value : values) {
			list.add(value);
		}
		map.put(key, list);
		return this;
	}

	@SneakyThrows
	@Override
	public String toString() {
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(map);
	}
}
