package com.example.spring.hotpepper.values;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Order {
	@JsonEnumDefaultValue
	NAME("1", "店名"),
	GENRE("2", " ジャンルM"),
	AREA_CODE("3", "エリア"),
	RECOMMEND("4", "おすすめ"),

	;
	final String id;
	final String label;

	@Override
	@JsonDeserialize
	public String toString() {
		return getId().toString();
	}

	@JsonCreator
	public static Order fromValue(String id) {
		return Arrays.asList(values())
				.stream()
				.filter(v -> Objects.equals(v.getId(), id))
				.findFirst()
				.orElse(NAME);
	}

}
