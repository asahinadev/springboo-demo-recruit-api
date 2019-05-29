package com.example.spring.common.values;

import java.util.Objects;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Wday {

	MON("1", "月曜日"),
	TUE("2", "火曜日"),
	WED("3", "水曜日"),
	THU("4", "木曜日"),
	FRY("5", "金曜日"),
	SAT("6", "土曜日"),
	SUN("7", "日曜日");

	final String id;

	final String label;

	@Override
	@JsonValue
	public String toString() {

		return getId();
	}

	@JsonCreator
	public static Wday fromValue(String id) {

		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), MON);
	}

}
