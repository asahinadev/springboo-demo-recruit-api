package com.example.spring.webapi.hotpepper.v1.entity;

import java.util.List;
import java.util.Map;

import com.example.spring.common.entity.ParameterBase;
import com.example.spring.common.entity.Urls;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Shop extends ParameterBase {

	@JsonProperty("id")
	String id;

	@JsonProperty("name")
	String name;

	@JsonProperty("logo_image")
	String logo;

	@JsonProperty("name_kana")
	String kana;

	@JsonProperty("address")
	String address;

	@JsonProperty("station_name")
	String stationName;

	@JsonProperty("ktai_coupon")
	String ktaiCoupon;

	@JsonProperty("large_service_area")
	LargeServiceArea largeServiceArea;

	@JsonProperty("service_area")
	ServiceArea ServiceArea;

	@JsonProperty("large_area")
	LargeArea largeArea;

	@JsonProperty("middle_area")
	MiddleArea middleArea;

	@JsonProperty("small_area")
	SmallArea smallArea;

	@JsonProperty("lat")
	Double lat;

	@JsonProperty("lng")
	Double lng;

	@JsonProperty("genre")
	Genre genre;

	@JsonProperty("sub_genre")
	Genre subGenre;

	@JsonProperty("budget")
	Budget budget;

	@JsonProperty("budget_memo")
	String budgetMemo;

	@JsonProperty("catch")
	String catchCopy;

	@JsonProperty("capacity")
	Long capacity;

	@JsonProperty("access")
	String access;

	@JsonProperty("mobile_access")
	String mobileAccess;

	@JsonProperty("urls")
	Urls urls;

	@JsonProperty("photo")
	Map<String, Urls> photos;

	@JsonProperty("open")
	String open;

	@JsonProperty("close")
	String close;

	@JsonProperty("party_capacity")
	Long partyCapacity;

	@JsonProperty("wifi")
	String wifi;

	@JsonProperty("wedding")
	String wedding;

	@JsonProperty("course")
	String course;

	@JsonProperty("free_drink")
	String freeDrink;

	@JsonProperty("free_food")
	String freeFood;

	@JsonProperty("private_room")
	String privateRoom;

	@JsonProperty("horigotatsu")
	String horigotatsu;

	@JsonProperty("tatami")
	String tatami;

	@JsonProperty("card")
	String card;

	@JsonProperty("non_smoking")
	String nonSmoking;

	@JsonProperty("charter")
	String charter;

	@JsonProperty("ktai")
	String ktai;

	@JsonProperty("parking")
	String parking;

	@JsonProperty("barrier_free")
	String barrier_free;

	@JsonProperty("other_memo")
	String otherMemo;

	@JsonProperty("sommelier")
	String sommelier;

	@JsonProperty("open_air")
	String open_air;

	@JsonProperty("show")
	String show;

	@JsonProperty("equipment")
	String equipment;

	@JsonProperty("karaoke")
	String karaoke;

	@JsonProperty("band")
	String band;

	@JsonProperty("tv")
	String tv;

	@JsonProperty("english")
	String english;

	@JsonProperty("pet")
	String pet;

	@JsonProperty("child")
	String child;

	@JsonProperty("lunch")
	String lunch;

	@JsonProperty("midnight")
	String midnight;

	@JsonProperty("shop_detail_memo")
	String shopDetailMemo;

	@JsonProperty("coupon_urls")
	Urls couponUrls;

	@JsonProperty("special")
	List<Special> specials;

	@JsonProperty("credit_card")
	List<CreditCard> creditCards;

	@JsonProperty("desc")
	String desc;

}
