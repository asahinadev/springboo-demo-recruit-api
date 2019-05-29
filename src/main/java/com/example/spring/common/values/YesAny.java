package com.example.spring.common.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum YesAny {

	YES("1", "絞り込み条件として設定する"),

	@JsonEnumDefaultValue
	ANY("0", "絞り込み条件として設定しない");

	final String id;

	final String label;

	@Override
	@JsonValue
	public String toString() {

		return getId();
	}

	@JsonCreator
	public static YesAny fromValue(String id) {

		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), ANY);
	}
}
