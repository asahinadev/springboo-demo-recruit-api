package com.example.spring.common.values;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Range {
	@JsonEnumDefaultValue
	NONE("", ""),

	HOTPEPPER_RANGE_1("1", " 300M"),
	HOTPEPPER_RANGE_2("2", " 500M"),
	HOTPEPPER_RANGE_3("3", "1000M"),
	HOTPEPPER_RANGE_4("4", "2000M"),
	HOTPEPPER_RANGE_5("5", "3000M"),

	MANABI_RANGE_1("1", " 1km"),
	MANABI_RANGE_2("2", " 2km"),
	MANABI_RANGE_3("3", " 5km"),
	MANABI_RANGE_4("4", "10km"),
	MANABI_RANGE_5("5", "20km"),

	MANABI_JUKO_PRICE_RANGE_1("0", "無料 "),
	MANABI_JUKO_PRICE_RANGE_2("1", "    1 円 ～ 1000 円"),
	MANABI_JUKO_PRICE_RANGE_3("2", " 1000 円 ～ 3000 円"),
	MANABI_JUKO_PRICE_RANGE_4("3", " 3000 円 ～        "),

	MANABI_START_TIME_RANGE_1("0", "午前 (00:00～11:59)"),
	MANABI_START_TIME_RANGE_2("1", "午後 (12:00～23:59)"),
	MANABI_START_TIME_RANGE_3("2", "夕方 (17:00～23:59)"),
	MANABI_START_TIME_RANGE_4("3", "夕方 (18:00～23:59)"),
	MANABI_START_TIME_RANGE_5("4", "夜間 (19:00～23:59)"),
	MANABI_START_TIME_RANGE_6("5", "夜間 (20:00～23:59)"),
	MANABI_START_TIME_RANGE_7("6", "夜間 (21:00～23:59)"),

	;;

	final String id;

	final String label;

	@Override
	@JsonValue
	public String toString() {

		return getId().toString();
	}

	@JsonCreator
	public static Range fromValue(String id) {

		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), NONE);
	}

	public static List<Range> hotpepperValues() {

		return Arrays.stream(values())
				.filter(i -> i.name().startsWith("HOTPEPPER_RANGE"))
				.collect(Collectors.toList());
	}

	public static List<Range> manabiValues() {

		return Arrays.stream(values())
				.filter(i -> i.name().startsWith("MANABI_RANGE"))
				.collect(Collectors.toList());
	}

	public static List<Range> manabiJukoPriceValues() {

		return Arrays.stream(values())
				.filter(i -> i.name().startsWith("MANABI_JUKO_PRICE_RANGE"))
				.collect(Collectors.toList());
	}

	public static List<Range> manabiStartTimeValues() {

		return Arrays.stream(values())
				.filter(i -> i.name().startsWith("MANABI_START_TIME_RANGE"))
				.collect(Collectors.toList());
	}

}
