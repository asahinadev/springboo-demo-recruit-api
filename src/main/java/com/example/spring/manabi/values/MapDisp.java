package com.example.spring.manabi.values;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MapDisp {

	@JsonEnumDefaultValue
	DISP("1", "対象"),
	ANY("0", "対象外");

	final String id;
	final String label;

	@Override
	@JsonDeserialize
	public String toString() {
		return getId();
	}

	@JsonCreator
	public static MapDisp fromValue(String id) {
		return Arrays.asList(values())
				.stream()
				.filter(v -> Objects.equals(v.toString(), id))
				.findFirst()
				.orElse(ANY);
	}
}
