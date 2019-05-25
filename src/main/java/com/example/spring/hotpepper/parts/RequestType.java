package com.example.spring.hotpepper.parts;

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

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

		map.add("key", getKey());
		map.add("format", "json");

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

}
