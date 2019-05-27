package com.example.spring.hotpepper.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

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
	@JsonValue
	public String toString() {
		return getId().toString();
	}

	@JsonCreator
	public static Range fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), RANGE_3);
	}

}
