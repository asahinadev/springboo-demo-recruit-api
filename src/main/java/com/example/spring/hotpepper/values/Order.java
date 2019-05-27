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
public enum Order {
	@JsonEnumDefaultValue
	ORDER_1("1", "店名"),

	ORDER_2("2", " ジャンルM"),

	ORDER_3("3", "エリア"),

	ORDER_4("4", "おすすめ"),

	;
	final String id;
	final String label;

	@Override
	@JsonDeserialize
	public String toString() {
		return getId().toString();
	}

	@JsonCreator
	public static Order fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), ORDER_1);
	}

}
