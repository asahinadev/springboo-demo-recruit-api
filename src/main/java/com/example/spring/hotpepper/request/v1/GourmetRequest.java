package com.example.spring.hotpepper.request.v1;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.util.MultiValueMap;

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

	@Size(max = 20)
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

	@Size(max = 3)
	@JsonProperty("service_area")
	List<String> serviceArea;

	@Size(max = 3)
	@JsonProperty("large_area")
	List<String> largeArea;

	@Size(max = 5)
	@JsonProperty("middle_area")
	List<String> middleArea;

	@Size(max = 5)
	@JsonProperty("small_area")
	List<String> smallArea;

	@JsonProperty("keyword")
	String keyword;

	@Min(-180)
	@Max(180)
	@JsonProperty("lat")
	Double lat;

	@Min(-90)
	@Max(90)
	@JsonProperty("lng")
	Double lng;

	@NotNull
	@JsonProperty("range")
	Range range = Range.RANGE_3;

	@JsonProperty("datum")
	Datum datum = Datum.TOKYO;

	@JsonProperty("ktai_coupon")
	Coupon ktaiCoupon = Coupon.ANY;

	@JsonProperty("genre")
	List<String> genre;

	@Size(max = 2)
	@JsonProperty("budget")
	List<String> budget;

	@Min(1)
	@Max(100)
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

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "id", id);
		add(map, "name", name);
		add(map, "name_kana", nameKana);
		add(map, "name_any", nameAny);
		add(map, "tel", tel);
		add(map, "address", address);
		add(map, "special", special);
		add(map, "special_or", specialOr);
		add(map, "special_category", specialCategory);
		add(map, "special_category_or", specialCategoryOr);
		add(map, "large_service_area", largeServiceArea);
		add(map, "service_area", serviceArea);
		add(map, "large_area", largeArea);
		add(map, "middle_area", middleArea);
		add(map, "small_area", smallArea);
		add(map, "keyword", keyword);
		add(map, "lat", lat);
		add(map, "lng", lng);
		add(map, "range", range);
		add(map, "datum", datum);
		add(map, "ktai_coupon", ktaiCoupon);
		add(map, "genre", genre);
		add(map, "budget", budget);
		add(map, "party_capacity", partyCapacity);
		add(map, "wifi", wifi);
		add(map, "wedding", wedding);
		add(map, "course", course);
		add(map, "free_drink", freeDrink);
		add(map, "free_food", freeFood);
		add(map, "private_room", privateRoom);
		add(map, "horigotatsu", horigotatsu);
		add(map, "tatami", tatami);
		add(map, "cocktail", cocktail);
		add(map, "shochu", shochu);
		add(map, "sake", sake);
		add(map, "wine", wine);
		add(map, "card", card);
		add(map, "non_smoking", nonSmoking);
		add(map, "charter", charter);
		add(map, "ktai", ktai);
		add(map, "parking", parking);
		add(map, "barrier_free", barrierFree);
		add(map, "sommelier", sommelier);
		add(map, "night_view", nightView);
		add(map, "open_air", open_air);
		add(map, "show", show);
		add(map, "equipment", equipment);
		add(map, "karaoke", karaoke);
		add(map, "band", band);
		add(map, "tv", tv);
		add(map, "lunch", lunch);
		add(map, "midnight", midnight);
		add(map, "midnight_meal", midnightMeal);
		add(map, "english", english);
		add(map, "pet", pet);
		add(map, "child", child);
		add(map, "credit_card", creditCard);
		add(map, "type", type);
		add(map, "order", order);

		return map;
	}
}
