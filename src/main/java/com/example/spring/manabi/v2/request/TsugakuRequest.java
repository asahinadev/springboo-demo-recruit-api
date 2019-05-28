package com.example.spring.manabi.v2.request;

import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.manabi.v2.values.JukoPriceRange;
import com.example.spring.manabi.v2.values.Order;
import com.example.spring.manabi.v2.values.Range;
import com.example.spring.manabi.v2.values.StartTimePeriod;
import com.example.spring.manabi.v2.values.Term;
import com.example.spring.values.YesAny;
import com.example.spring.values.Wday;
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
public class TsugakuRequest extends RequestType {

	@JsonProperty("code")
	List<String> codes;
	@JsonProperty("school")
	List<String> schools;
	@JsonProperty("kyoten")
	List<String> kyotens;
	@JsonProperty("capsule_type")
	List<String> capsuleTypes;
	@JsonProperty("category")
	List<String> categories;
	@JsonProperty("capsule")
	List<String> capsules;
	@JsonProperty("sub_capsule")
	List<String> subCapsules;
	@JsonProperty("tokushu")
	List<String> tokushus;
	@JsonProperty("area")
	List<String> areas;
	@JsonProperty("prefecture")
	List<String> prefectures;
	@JsonProperty("city")
	List<String> cities;
	@JsonProperty("other_city")
	YesAny otherCity;
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
	Range range;
	@JsonProperty("wday")
	List<Wday> wday;
	@JsonProperty("start_time_period")
	List<StartTimePeriod> startTimePeriods;
	@JsonProperty("juko_price_range")
	List<JukoPriceRange> jukoPriceRange;
	@JsonProperty("term")
	List<Term> term;
	@JsonProperty("shiryo")
	YesAny shiryo;
	@JsonProperty("keyword")
	String keyword;
	@JsonProperty("keyword_or")
	List<String> keywordOr;
	@JsonProperty("order")
	Order order;

}
