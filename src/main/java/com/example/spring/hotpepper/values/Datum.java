package com.example.spring.hotpepper.values;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public enum Datum {
	WORLD,
	@JsonEnumDefaultValue
	TOKYO;

	@Override
	@JsonDeserialize
	public String toString() {
		return name().toLowerCase();
	}

	@JsonCreator
	public static Datum fromValue(String name) {
		return Arrays.asList(values())
				.stream()
				.filter(v -> Objects.equals(v.name(), name))
				.findFirst()
				.orElse(Datum.TOKYO);
	}
}
