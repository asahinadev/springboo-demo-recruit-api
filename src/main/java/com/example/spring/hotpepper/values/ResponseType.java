package com.example.spring.hotpepper.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseType {
	DEFAULT("", "標準"),
	LITE("lite", "軽量"),
	CREDIT_CARD("credit_card", "クレジットカード情報を付与"),
	SPECIAL("special", "特集情報を付与"),
	@JsonEnumDefaultValue
	ALL("credit_card+special", "全て");

	final String id;
	final String label;

	@Override
	@JsonDeserialize
	public String toString() {
		return getId();
	}

	@JsonCreator
	public static ResponseType fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), DEFAULT);
	}
}
