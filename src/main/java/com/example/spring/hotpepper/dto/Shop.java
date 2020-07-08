package com.example.spring.hotpepper.dto;

import java.net.URI;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Shop {
	String id;
	String name;
	String name_kana;

	int desc;

	String address;
	String station_name;
	String access;
	String mobile_access;

	LargeServiceArea large_service_area;
	ServiceArea service_area;
	LargeArea large_area;
	MiddleArea middle_area;
	SmallArea small_area;

	double lat;
	double lng;

	Genre genre;
	Genre sub_genre;

	Budget budget;
	String budget_memo;

	@JsonProperty("catch")
	String catchcopy;
	String capacity;
	String party_capacity;
	String open;
	String close;
	String wifi;
	String wedding;
	String course;
	String free_drink;
	String free_food;
	String private_room;
	String horigotatsu;
	String tatami;
	String card;
	String non_smoking;
	String charter;
	String ktai;
	String parking;
	String barrier_free;
	String other_memo;
	String sommelier;
	String open_air;
	String show;
	String equipment;
	String karaoke;
	String band;
	String tv;
	String english;
	String pet;
	String child;
	String lunch;
	String midnight;
	String shop_detail_memo;

	URI logo_image;
	Map<String, URI> coupon_urls;
	Map<String, URI> urls;
	Map<String, Map<String, URI>> photo;

	int ktai_coupon;

}
