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
public enum Range {
	RANGE_1("1", " 300M"),
	RANGE_2("2", " 500M"),
	@JsonEnumDefaultValue
	RANGE_3("3", "1000M"),
	RANGE_4("4", "2000M"),
	RANGE_5("5", "3000M"),

	;
	final String id;
	final String label;

	@Override
	@JsonDeserialize
	public String toString() {
		return getId().toString();
	}

	@JsonCreator
	public static Range fromValue(String id) {
		return Arrays.asList(values())
				.stream()
				.filter(v -> Objects.equals(v.getId(), id))
				.findFirst()
				.orElse(RANGE_3);
	}

}
