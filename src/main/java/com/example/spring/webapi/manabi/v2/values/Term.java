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
public enum Term {

	@JsonEnumDefaultValue
	TERM_1("0", "1か月未満"),
	TERM_2("1", "3か月以内"),
	TERM_3("2", "6か月以内"),
	TERM_4("3", "6か月以上"),
	TERM_5("9", "1回完結");

	final String id;

	final String label;

	@Override
	@JsonValue
	public String toString() {

		return getId();
	}

	@JsonCreator
	public static Term fromValue(String id) {

		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), TERM_1);
	}

}
