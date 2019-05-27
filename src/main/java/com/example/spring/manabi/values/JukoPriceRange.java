package com.example.spring.manabi.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum JukoPriceRange {

	@JsonEnumDefaultValue
	NONE("", "指定なし"),
	FREE("0", "無料 "),
	LOW("1", "    1 円 ～ 1000 円"),
	MID("2", " 1000 円 ～ 3000 円"),
	HIG("3", " 3000 円 ～               "),

	;

	final String id;
	final String label;

	@Override
	@JsonValue
	public String toString() {
		return getId();
	}

	@JsonCreator
	public static JukoPriceRange fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), NONE);
	}

}
