package com.example.spring.hotpepper.v1.request;

import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.hotpepper.v1.values.Datum;
import com.example.spring.hotpepper.v1.values.Order;
import com.example.spring.hotpepper.v1.values.Range;
import com.example.spring.hotpepper.v1.values.ResponseType;
import com.example.spring.values.YesNoAny;
import com.example.spring.values.YesAny;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class GourmetRequest extends RequestType {

	@JsonProperty
	List<String> id;
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
	Range range;
	@JsonProperty("datum")
	Datum datum;
	@JsonProperty("ktai_coupon")
	YesNoAny ktaiCoupon;
	@JsonProperty("genre")
	List<String> genre;
	@JsonProperty("budget")
	List<String> budget;
	@JsonProperty("party_capacity")
	Integer partyCapacity;
	@JsonProperty("wifi")
	YesAny wifi;
	@JsonProperty("wedding")
	YesAny wedding;
	@JsonProperty("course")
	YesAny course;
	@JsonProperty("free_drink")
	YesAny freeDrink;
	@JsonProperty("free_food")
	YesAny freeFood;
	@JsonProperty("private_room")
	YesAny privateRoom;
	@JsonProperty("horigotatsu")
	YesAny horigotatsu;
	@JsonProperty("tatami")
	YesAny tatami;
	@JsonProperty("cocktail")
	YesAny cocktail;
	@JsonProperty("shochu")
	YesAny shochu;
	@JsonProperty("sake")
	YesAny sake;
	@JsonProperty("wine")
	YesAny wine;
	@JsonProperty("card")
	YesAny card;
	@JsonProperty("non_smoking")
	YesAny nonSmoking;
	@JsonProperty("charter")
	YesAny charter;
	@JsonProperty("ktai")
	YesAny ktai;
	@JsonProperty("parking")
	YesAny parking;
	@JsonProperty("barrier_free")
	YesAny barrierFree;
	@JsonProperty("sommelier")
	YesAny sommelier;
	@JsonProperty("night_view")
	YesAny nightView;
	@JsonProperty("open_air")
	YesAny open_air;
	@JsonProperty("show")
	YesAny show;
	@JsonProperty("equipment")
	YesAny equipment;
	@JsonProperty("karaoke")
	YesAny karaoke;
	@JsonProperty("band")
	YesAny band;
	@JsonProperty("tv")
	YesAny tv;
	@JsonProperty("lunch")
	YesAny lunch;
	@JsonProperty("midnight")
	YesAny midnight;
	@JsonProperty("midnight_meal")
	YesAny midnightMeal;
	@JsonProperty("english")
	YesAny english;
	@JsonProperty("pet")
	YesAny pet;
	@JsonProperty("child")
	YesAny child;
	@JsonProperty("credit_card")
	List<String> creditCard;
	@JsonProperty("type")
	ResponseType type;
	@JsonProperty("order")
	Order order;

}
