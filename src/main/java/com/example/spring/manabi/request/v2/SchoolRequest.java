package com.example.spring.manabi.request.v2;

import java.util.Arrays;
import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.manabi.values.KyotenType;
import com.example.spring.manabi.values.Order;
import com.example.spring.manabi.values.Range;
import com.example.spring.values.Flag;
import com.example.spring.values.Wday;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class SchoolRequest extends RequestType {

	@JsonProperty("kyoten_type")
	KyotenType ｋKyotenType;
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
	@JsonProperty("wday")
	List<Wday> wday = Arrays.asList(Wday.values());
	@JsonProperty("eigyo_time_from")
	String eigyoTimeFrom;
	@JsonProperty("eigyo_time_to")
	String eigyoTimeTo;
	@JsonProperty("tokucho")
	List<String> tokuchos;
	@JsonProperty("lat")
	Double lat;
	@JsonProperty("lng")
	Double lng;
	@JsonProperty("range")
	Range range = Range.RANGE_3;
	@JsonProperty("keyword")
	String keyword;
	@JsonProperty("keyword_or")
	List<String> keywordOr;
	@JsonProperty("order")
	Order order = Order.ORDER_1;

}
