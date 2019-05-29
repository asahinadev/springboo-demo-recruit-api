package com.example.spring.common.rest;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.example.spring.common.entity.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public abstract class RequestType extends ParameterBase {

	@JsonProperty("key")
	public String key;

	Long start;

	Long count;

	@SuppressWarnings("unchecked")
	@SneakyThrows
	public final MultiValueMap<String, String> convert() {

		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

		ObjectMapper om = new ObjectMapper();

		String json = om.writeValueAsString(this);
		Map<String, Object> obj = om.readValue(json, new TypeReference<Map<String, Object>>() {
		});

		for (Map.Entry<String, Object> entry : obj.entrySet()) {
			String key = entry.getKey();
			Object val = entry.getValue();

			switch (key) {
			case "key":
			case "start":
			case "count":
				continue;

			default:
				if (val instanceof Collection) {
					map.addAll(key, ((Collection<? extends Object>) val)
							.stream().map(String::valueOf)
							.filter(StringUtils::isNotEmpty)
							.collect(Collectors.toList()));
				} else if (val != null) {
					if (StringUtils.isNotEmpty(val.toString())) {
						map.add(key, val.toString());
					}
				}
				break;
			}

		}

		add(map, "key", getKey());
		add(map, "format", "json");
		add(map, "start", start);
		add(map, "count", count);

		return map;
	}

	public void add(MultiValueMap<String, String> map, String name, List<String> list) {

		if (list != null && !list.isEmpty()) {
			map.addAll(name, list);
		}
	}

	public <E> void add(MultiValueMap<String, String> map, String name, List<E> list, Function<E, String> mapper) {

		if (list != null && !list.isEmpty()) {
			map.addAll(name, list.stream().map(mapper).collect(Collectors.toList()));
		}
	}

	public <E> void add(
			MultiValueMap<String, String> map, String name, List<E> list, Function<E, String> mapper,
			Predicate<E> predicate) {

		if (list != null && !list.isEmpty()) {
			map.addAll(name, list.stream().filter(predicate).map(mapper).collect(Collectors.toList()));
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

		if (text != null && text.intValue() <= 0) {
			map.add(name, text.toString());
		}
	}

}