package com.example.spring.hotpepper.request.v1;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.hotpepper.values.Datum;
import com.example.spring.hotpepper.values.Order;
import com.example.spring.hotpepper.values.Range;
import com.example.spring.hotpepper.values.ResponseType;
import com.example.spring.values.Coupon;
import com.example.spring.values.Flag;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class GourmetRequest extends RequestType {

	@JsonProperty
	List<String> id = new ArrayList<>();
	@JsonProperty("name")
	String name;
	@JsonProperty("name_kana")
	String nameKana;
	@JsonProperty("name_any")
	String nameAny;
	@JsonProperty("tel")
	String tel;
	@JsonProperty("address")
	String address;
	@JsonProperty("special")
	List<String> special;
	@JsonProperty("special_or")
	List<String> specialOr;
	@JsonProperty("special_category")
	List<String> specialCategory;
	@JsonProperty("special_category_or")
	List<String> specialCategoryOr;
	@JsonProperty("large_service_area")
	String largeServiceArea;
	@JsonProperty("service_area")
	List<String> serviceArea;
	@JsonProperty("large_area")
	List<String> largeArea;
	@JsonProperty("middle_area")
	List<String> middleArea;
	@JsonProperty("small_area")
	List<String> smallArea;
	@JsonProperty("keyword")
	String keyword;
	@JsonProperty("lat")
	Double lat;
	@JsonProperty("lng")
	Double lng;
	@JsonProperty("range")
	Range range = Range.RANGE_3;
	@JsonProperty("datum")
	Datum datum = Datum.TOKYO;
	@JsonProperty("ktai_coupon")
	Coupon ktaiCoupon = Coupon.ANY;
	@JsonProperty("genre")
	List<String> genre;
	@JsonProperty("budget")
	List<String> budget;
	@JsonProperty("party_capacity")
	Integer partyCapacity;
	@JsonProperty("wifi")
	Flag wifi = Flag.ANY;
	@JsonProperty("wedding")
	Flag wedding = Flag.ANY;
	@JsonProperty("course")
	Flag course = Flag.ANY;
	@JsonProperty("free_drink")
	Flag freeDrink = Flag.ANY;
	@JsonProperty("free_food")
	Flag freeFood = Flag.ANY;
	@JsonProperty("private_room")
	Flag privateRoom = Flag.ANY;
	@JsonProperty("horigotatsu")
	Flag horigotatsu = Flag.ANY;
	@JsonProperty("tatami")
	Flag tatami = Flag.ANY;
	@JsonProperty("cocktail")
	Flag cocktail = Flag.ANY;
	@JsonProperty("shochu")
	Flag shochu = Flag.ANY;
	@JsonProperty("sake")
	Flag sake = Flag.ANY;
	@JsonProperty("wine")
	Flag wine = Flag.ANY;
	@JsonProperty("card")
	Flag card = Flag.ANY;
	@JsonProperty("non_smoking")
	Flag nonSmoking = Flag.ANY;
	@JsonProperty("charter")
	Flag charter = Flag.ANY;
	@JsonProperty("ktai")
	Flag ktai = Flag.ANY;
	@JsonProperty("parking")
	Flag parking = Flag.ANY;
	@JsonProperty("barrier_free")
	Flag barrierFree = Flag.ANY;
	@JsonProperty("sommelier")
	Flag sommelier = Flag.ANY;
	@JsonProperty("night_view")
	Flag nightView = Flag.ANY;
	@JsonProperty("open_air")
	Flag open_air = Flag.ANY;
	@JsonProperty("show")
	Flag show = Flag.ANY;
	@JsonProperty("equipment")
	Flag equipment = Flag.ANY;
	@JsonProperty("karaoke")
	Flag karaoke = Flag.ANY;
	@JsonProperty("band")
	Flag band = Flag.ANY;
	@JsonProperty("tv")
	Flag tv = Flag.ANY;
	@JsonProperty("lunch")
	Flag lunch = Flag.ANY;
	@JsonProperty("midnight")
	Flag midnight = Flag.ANY;
	@JsonProperty("midnight_meal")
	Flag midnightMeal = Flag.ANY;
	@JsonProperty("english")
	Flag english = Flag.ANY;
	@JsonProperty("pet")
	Flag pet = Flag.ANY;
	@JsonProperty("child")
	Flag child = Flag.ANY;
	@JsonProperty("credit_card")
	List<String> creditCard;
	@JsonProperty("type")
	ResponseType type = ResponseType.RESPONCE_A;
	@JsonProperty("order")
	Order order = Order.ORDER_1;

}
