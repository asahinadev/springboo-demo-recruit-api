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
public enum AlongType {

	@JsonEnumDefaultValue
	OT("00010", "私鉄"),
	JR("00020", "JR"),
	SW("00030", "地下鉄");

	final String id;

	final String label;

	@Override
	@JsonValue
	public String toString() {

		return getId();
	}

	@JsonCreator
	public static AlongType fromValue(String id) {

		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), JR);
	}
}
