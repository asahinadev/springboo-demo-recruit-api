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
	HOTPEPER_ORDER_2("2", "ジャンルM"),
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

	AP_ROAD_ORDER_1("1", "価格安い順"),
	AP_ROAD_ORDER_2("2", "価格高い順"),
	AP_ROAD_ORDER_3("3", "期間短い順"),
	AP_ROAD_ORDER_4("4", "期間長い順"),
	AP_ROAD_ORDER_5("5", "ランキング順"),

	AP_ROAD_COUNTRY_ORDER_1("0", "エリアコード＋国名順"),
	AP_ROAD_COUNTRY_ORDER_2("1", "国名順"),
	AP_ROAD_COUNTRY_ORDER_3("2", "ABROAD指定順"),

	AP_ROAD_CITY_ORDER_1("0", "エリアコード＋国名＋都市名順"),
	AP_ROAD_CITY_ORDER_2("1", "国名＋都市名順"),
	AP_ROAD_CITY_ORDER_3("2", "ABROAD指定順"),

	AP_ROAD_HOTEL_ORDER_1("0", "ホテル名順"),
	AP_ROAD_HOTEL_ORDER_2("1", "エリアコード＋国名＋都市名順＋ホテル名順"),
	AP_ROAD_HOTEL_ORDER_3("2", "ABROAD指定順"),

	AP_ROAD_TALLY_ORDER_1("0", "該当ツアー数多い順"),
	AP_ROAD_TALLY_ORDER_2("1", "該当ツアー数少ない順"),
	AP_ROAD_TALLY_ORDER_3("2", "エリアコード＋国名＋都市名順"),

	AP_ROAD_AIRE_ORDER_1("1", "価格安い順"),
	AP_ROAD_AIRE_ORDER_2("2", "価格高い順"),
	AP_ROAD_AIRE_ORDER_3("3", "期間短い順"),
	AP_ROAD_AIRE_ORDER_4("4", "期間長い順"),

	AP_ROAD_AIRE_CITY_ORDER_1("1", "国名＋都市名"),
	AP_ROAD_AIRE_CITY_ORDER_2("2", "都市名"),

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

	public static List<Order> values(String startsWith) {

		return Arrays.stream(values()).filter(i -> i.name().startsWith(startsWith)).collect(Collectors.toList());
	}

	public static List<Order> hotpepperValues() {

		return values("HOTPEPER_ORDER");
	}

	public static List<Order> manabiValues() {

		return values("MANABI_ORDER");
	}

	public static List<Order> carcensorUsedValues() {

		return values("CARCENSOR_USED__ORDER");
	}

	public static List<Order> carcensorCatalogValues() {

		return values("CARCENSOR_CATALOG_ORDER");
	}

	public static List<Order> aproadaireValues() {

		return values("AP_ROAD_AIRE_ORDER");
	}

	public static List<Order> aproadaireCityValues() {

		return values("AP_ROAD_AIRE_CITY_ORDER");
	}

	public static List<Order> aproadValues() {

		return values("AP_ROAD_ORDER");
	}

	public static List<Order> aproadCountryValues() {

		return values("AP_ROAD_COUNTRY_ORDER");
	}

	public static List<Order> aproadCityValues() {

		return values("AP_ROAD_CITY_ORDER");
	}

	public static List<Order> aproadHotelValues() {

		return values("AP_ROAD_HOTEL_ORDER");
	}

	public static List<Order> aproadTallyValues() {

		return values("AP_ROAD_TALLY_ORDER");
	}

}
