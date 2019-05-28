package com.example.spring.common.values;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.example.spring.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Order {

	NONE("", ""),

	HOTPEPER_ORDER_1("1", "店名"),
	HOTPEPER_ORDER_2("2", " ジャンルM"),
	HOTPEPER_ORDER_3("3", "エリア"),
	HOTPEPER_ORDER_4("4", "おすすめ"),

	MANABI_ORDER_1("0", "おすすめ順"),
	MANABI_ORDER_2("1", "距離順"),

	CARCENSOR_USED_ORDER_1("0", "ブランド順"),
	CARCENSOR_USED_ORDER_2("1", "価格安い順"),
	CARCENSOR_USED_ORDER_3("2", "価格高い順"),
	CARCENSOR_USED_ORDER_4("3", "車種名順"),
	CARCENSOR_USED_ORDER_5("4", "年式古い順"),
	CARCENSOR_USED_ORDER_6("5", "年式新しい順"),
	CARCENSOR_USED_ORDER_7("6", "走行距離少ない順"),

	CARCENSOR_CATALOG_ORDER_1("0", "ブランド順"),
	CARCENSOR_CATALOG_ORDER_2("1", "モデル名順"),

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
		return EnumUtil.fromValue(values(), v -> Objects.equals(v.toString(), id), NONE);
	}

	public static List<Order> hotpepperValues() {
		return Arrays.stream(values())
				.filter(i -> i.name().startsWith("HOTPEPER_ORDER"))
				.collect(Collectors.toList());
	}

	public static List<Order> manabiValues() {
		return Arrays.stream(values())
				.filter(i -> i.name().startsWith("MANABI_ORDER"))
				.collect(Collectors.toList());
	}

	public static List<Order> carcensorUsedValues() {
		return Arrays.stream(values())
				.filter(i -> i.name().startsWith("CARCENSOR_USED__ORDER"))
				.collect(Collectors.toList());
	}

	public static List<Order> carcensorCatalogValues() {
		return Arrays.stream(values())
				.filter(i -> i.name().startsWith("CARCENSOR_CATALOG_ORDER"))
				.collect(Collectors.toList());
	}

}
