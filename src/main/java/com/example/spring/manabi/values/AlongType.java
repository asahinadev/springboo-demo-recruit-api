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
public enum AlongType {

	@JsonEnumDefaultValue
	OTHER("00010", "私鉄"),
	JR("00020", "JR"),
	SUBWAY("00030", "地下鉄"),
	NONE("", "未指定");

	final String id;
	final String label;

	@Override
	@JsonDeserialize
	public String toString() {
		return getId();
	}

	@JsonCreator
	public static AlongType fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), NONE);
	}
}
