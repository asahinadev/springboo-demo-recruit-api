package com.example.spring.hotpepper.v1.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseType {

	RESPONCE_D("", "標準"),

	RESPONCE_L("lite", "軽量"),

	RESPONCE_C("credit_card", "クレジットカード情報を付与"),

	RESPONCE_S("special", "特集情報を付与"),

	@JsonEnumDefaultValue
	RESPONCE_A("credit_card+special", "全て");

	final String id;
	final String label;

	@Override
	@JsonValue
	public String toString() {
		return getId();
	}

	@JsonCreator
	public static ResponseType fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), RESPONCE_A);
	}
}
