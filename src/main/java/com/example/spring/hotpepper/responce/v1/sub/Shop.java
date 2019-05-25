package com.example.spring.hotpepper.responce.v1.sub;

import java.util.List;
import java.util.Map;

import com.example.spring.hotpepper.parts.ParameterBase;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Shop extends ParameterBase {

	@JsonProperty("id")
	String id;

	@JsonProperty("name")
	String name;

	@JsonProperty("name_kana")
	String kana;

	@JsonProperty("shop_detail_memo")
	String shopDetailMemo;

	@JsonProperty("budget_memo")
	String budgetMemo;

	@JsonProperty("non_smoking")
	String smoking;

	@JsonProperty("parking")
	String parking;

	@JsonProperty("other_memo")
	String otherMemo;

	@JsonProperty("logo_image")
	String logo;

	@JsonProperty("open")
	String open;

	@JsonProperty("close")
	String close;

	@JsonProperty("midnight")
	String midnight;

	@JsonProperty("genre")
	Genre genre;

	@JsonProperty("sub_genre")
	Genre subGenre;

	@JsonProperty("address")
	String address;

	@JsonProperty("lat")
	Double lat;

	@JsonProperty("lng")
	Double lng;

	@JsonProperty("station_name")
	String station;

	@JsonProperty("mobile_access")
	String mobileAccess;

	@JsonProperty("access")
	String access;

	@JsonProperty("large_service_area")
	LargeServiceArea largeServiceArea;;

	@JsonProperty("service_area")
	ServiceArea ServiceArea;;

	@JsonProperty("large_area")
	LargeArea largeArea;;

	@JsonProperty("middle_area")
	MiddleArea middleArea;

	@JsonProperty("small_area")
	SmallArea smallArea;

	@JsonProperty("budget")
	Budget budget;

	@JsonProperty("urls")
	Map<String, String> urls;

	@JsonProperty("photo")
	Map<String, Map<String, String>> photos;

	@JsonProperty("coupon_urls")
	Map<String, String> couponUrls;

	@JsonProperty("desc")
	String desc;

	@JsonProperty("ktai_coupon")
	String ktaiCoupon;

	@JsonProperty("capacity")
	Long capacity;

	@JsonProperty("party_capacity")
	Long partyCapacity;

	@JsonProperty("special")
	List<Special> specials;

	@JsonProperty("credit_card")
	List<CreditCard> creditCards;

	@JsonAnySetter
	Map<String, String> any;
}
