package com.example.spring.webapi.manabi.v2.request;

import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.common.values.Wday;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.manabi.v2.values.JukoPriceRange;
import com.example.spring.webapi.manabi.v2.values.Order;
import com.example.spring.webapi.manabi.v2.values.Range;
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
public class EventRequest extends RequestType {

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
	@JsonProperty("start_time_from")
	String startTimeFrom;
	@JsonProperty("start_time_to")
	String startTimeTo;
	@JsonProperty("date_from")
	String dateFrom;
	@JsonProperty("date_to")
	String dateTo;
	@JsonProperty("juko_price_range")
	List<JukoPriceRange> jukoPriceRange;
	@JsonProperty("keyword")
	String keyword;
	@JsonProperty("keyword_or")
	List<String> keywordOr;
	@JsonProperty("reserve_type")
	String reserveType;
	@JsonProperty("order")
	Order order;

}
