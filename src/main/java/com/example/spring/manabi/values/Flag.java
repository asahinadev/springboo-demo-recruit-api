package com.example.spring.manabi.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Flag {
	Y("1", "有"),
	@JsonEnumDefaultValue
	A("0", "すべて");

	final String id;
	final String label;

	@Override
	@JsonDeserialize
	public String toString() {
		return getId();
	}

	@JsonCreator
	public static Flag fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), A);
	}
}
