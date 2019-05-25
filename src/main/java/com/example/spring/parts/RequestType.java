package com.example.spring.parts;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public abstract class RequestType extends ParameterBase {

	@JsonProperty("key")
	public String key;

	public Long start = 0L;
	public Long count = 0L;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

		map.add("key", getKey());
		map.add("format", "json");

		if (start == 0) {
			add(map, "start", start);
		}

		if (count == 0) {
			add(map, "count", count);
		}

		return map;
	}

	public void add(MultiValueMap<String, String> map, String name, List<String> list) {
		if (list != null && !list.isEmpty()) {
			map.addAll(name, list);
		}
	}

	public void add(MultiValueMap<String, String> map, String name, String text) {
		if (StringUtils.isNotEmpty(text)) {
			map.add(name, text);
		}
	}

	public void add(MultiValueMap<String, String> map, String name, Enum<?> text) {
		if (text != null) {
			map.add(name, text.toString());
		}
	}

	public void add(MultiValueMap<String, String> map, String name, Number text) {
		if (text != null) {
			map.add(name, text.toString());
		}
	}

}
