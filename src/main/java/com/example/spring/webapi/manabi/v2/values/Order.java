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
public enum Order {
	@JsonEnumDefaultValue
	ORDER_1("0", "おすすめ順"),

	ORDER_2("1", " 距離順"),

	;
	final String id;
	final String label;

	@Override
	@JsonValue
	public String toString() {
		return getId().toString();
	}

	@JsonCreator
	public static Order fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), ORDER_1);
	}

}
