package com.example.spring.webapi.manabi.v2.values;

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

	RANGE_1("1", " 1km"),

	RANGE_2("2", " 2km"),

	@JsonEnumDefaultValue
	RANGE_3("3", " 5km"),

	RANGE_4("4", "10km"),

	RANGE_5("5", "20km"),

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
