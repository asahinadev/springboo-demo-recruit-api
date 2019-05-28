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
public enum TokuchoType {

	@JsonEnumDefaultValue
	VALUE_01("01", "拠点特徴"),
	VALUE_02("02", "講座特徴");

	final String id;
	final String label;

	@Override
	@JsonValue
	public String toString() {
		return getId();
	}

	@JsonCreator
	public static TokuchoType fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), VALUE_01);
	}

}
