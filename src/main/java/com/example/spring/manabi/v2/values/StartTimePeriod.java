package com.example.spring.manabi.v2.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum StartTimePeriod {

	@JsonEnumDefaultValue
	AM("0", "午前"),
	PM("1", "午後"),
	AFT_17("2", "17時～"),
	AFT_18("3", "18時～"),
	AFT_19("4", "19時～"),
	AFT_20("5", "20時～"),
	AFT_21("6", "21時～"),
	;

	final String id;
	final String label;

	@Override
	@JsonValue
	public String toString() {
		return getId();
	}

	@JsonCreator
	public static StartTimePeriod fromValue(String id) {
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), AFT_19);
	}

}
