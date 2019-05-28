package com.example.spring.manabi.v2.response.entity;

import java.util.Map;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Kyoten extends MasterBase {

	@JsonProperty("name_kana")
	String kana;

	@JsonProperty("kyoten_type_cd")
	String kyotenTypeCd;

	@JsonProperty("instructor_haken_flg")
	String instructorHakenFlg;

	@JsonProperty("senmon_school_flg")
	String senmonSchoolFlg;

	@JsonProperty("read")
	String read;

	@JsonProperty("school_logo")
	String schoolLogo;

	@JsonProperty("catch")
	String catchCopy;

	@JsonProperty("area")
	Area area;

	@JsonProperty("prefecture")
	Prefecture prefecture;

	@JsonProperty("city")
	City city;

	@JsonProperty("shiryo_url")
	Urls shiryoUrls;

	@JsonProperty("photo")
	Urls photos;

	@JsonProperty("url")
	Urls urls;

	@JsonProperty("tokushu_list")
	TokushuList tokushuList;

	@JsonProperty("tokucho_group_list")
	TokuchoGroupList tokuchoGroupList;

	@JsonProperty("station_list")
	StationList stationList;

	@JsonProperty("capsule_list")
	CapsuleList capsuleList;

	@JsonProperty("map")
	LatLng map;

	@JsonProperty("point_list")
	PointList pointList;

	@JsonProperty("news")
	News news;

	@JsonProperty("spec")
	Map<String, Object> spec;

	@JsonProperty("corporate")
	Map<String, Object> corporate;

	@JsonProperty("kouza_list")
	KouzaList kouzaList;

	@JsonProperty("access")
	String access;

	@JsonProperty("official_url")
	String officialUrl;

	@JsonProperty("zip")
	String zip;

	@JsonProperty("address")
	String address;

	@JsonProperty("tel")
	String tel;

}
