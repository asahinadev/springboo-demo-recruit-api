package com.example.spring.manabi.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SchoolType {

	@JsonEnumDefaultValue
	TSUGAKU("01", "通学専用"),

	TSUSHIN("02", "通信専用"),

	KENYOU("03", "通学通信兼用"),

	;

	final String id;
	final String label;

	@Override
	@JsonValue
	public String toString() {
		return getId();
	}

	@JsonCreator
	public static SchoolType fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), TSUGAKU);
	}

}
