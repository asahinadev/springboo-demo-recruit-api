package com.example.spring.webapi.manabi.v2.request;

import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.common.values.Order;
import com.example.spring.common.values.Range;
import com.example.spring.common.values.Wday;
import com.example.spring.common.values.YesAny;
import com.example.spring.webapi.manabi.v2.values.KyotenType;
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
public class SchoolRequest extends RequestType {

	@JsonProperty("kyoten_type")
	KyotenType kyotenType;
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
	@JsonProperty("wday")
	List<Wday> wday;
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
	Range range;
	@JsonProperty("keyword")
	String keyword;
	@JsonProperty("keyword_or")
	List<String> keywordOr;
	@JsonProperty("order")
	Order order;

}
