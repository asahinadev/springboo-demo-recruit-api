package com.example.spring.hotpepper.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
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
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), name), TOKYO);
	}
}
