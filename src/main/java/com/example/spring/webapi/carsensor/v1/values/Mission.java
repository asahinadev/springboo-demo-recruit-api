package com.example.spring.webapi.carsensor.v1.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Mission {

	MT("2", "マニュアル"),

	@JsonEnumDefaultValue
	AT("1", "オートマ");

	final String id;

	final String label;

	@Override
	@JsonValue
	public String toString() {

		return getId();
	}

	@JsonCreator
	public static Mission fromValue(String id) {

		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), AT);
	}
}
