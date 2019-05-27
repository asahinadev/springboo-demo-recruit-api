package com.example.spring.manabi.request.v2;

import java.util.Arrays;
import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.manabi.values.JukoPriceRange;
import com.example.spring.manabi.values.Order;
import com.example.spring.manabi.values.Range;
import com.example.spring.manabi.values.StartTimePeriod;
import com.example.spring.manabi.values.Term;
import com.example.spring.values.Flag;
import com.example.spring.values.Wday;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class TsugakuRequest extends RequestType {

	@JsonProperty("code")
	List<String> codes;
	@JsonProperty("school")
	List<String> school;
	@JsonProperty("kyoten")
	List<String> kyoten;
	@JsonProperty("capsule_type")
	List<String> capsuleType;
	@JsonProperty("category")
	List<String> category;
	@JsonProperty("capsule")
	List<String> capsule;
	@JsonProperty("sub_capsule")
	List<String> subCapsule;
	@JsonProperty("tokushu")
	List<String> tokushu;
	@JsonProperty("area")
	List<String> areas;
	@JsonProperty("prefecture")
	List<String> prefectures;
	@JsonProperty("city")
	List<String> cities;
	@JsonProperty("other_city")
	Flag otherCity = Flag.ANY;
	@JsonProperty("along")
	List<String> alongs;
	@JsonProperty("station")
	List<String> stations;
	@JsonProperty("zip")
	List<String> zips;
	@JsonProperty("tel")
	List<String> tels;
	@JsonProperty("tokucho")
	List<String> tokuchos;
	@JsonProperty("lat")
	Double lat;
	@JsonProperty("lng")
	Double lng;
	@JsonProperty("range")
	Range range = Range.RANGE_3;
	@JsonProperty("wday")
	List<Wday> wday = Arrays.asList(Wday.values());
	@JsonProperty("start_time_period")
	List<StartTimePeriod> startTimePeriods = Arrays.asList(StartTimePeriod.NONE);
	@JsonProperty("juko_price_range")
	List<JukoPriceRange> jukoPriceRange = Arrays.asList(JukoPriceRange.NONE);
	@JsonProperty("term")
	List<Term> ｔerm = Arrays.asList(Term.NONE);
	@JsonProperty("shiryo")
	Flag shiryo = Flag.ANY;
	@JsonProperty("keyword")
	String keyword;
	@JsonProperty("keyword_or")
	List<String> keywordOr;
	@JsonProperty("order")
	Order order = Order.ORDER_1;

}
