package com.example.spring.webapi.manabi.v2.response.entity;

import java.util.Map;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Event extends MasterBase {

	@JsonProperty("read")
	String read;

	@JsonProperty("catch")
	String catchCopy;

	@JsonProperty("point_title")
	String pointTitle;

	@JsonProperty("school")
	School school;

	@JsonProperty("tokushu_list")
	TokushuList tokushuList;

	@JsonProperty("tokucho_group_list")
	TokuchoGroupList tokuchoGroupList;

	@JsonProperty("point_list")
	PointList pointList;

	@JsonProperty("photo")
	Urls photo;

	@JsonProperty("url")
	Urls url;

	@JsonProperty("capsule_list")
	CapsuleList capsuleList;

	@JsonProperty("spec")
	Map<String, Object> spec;

	@JsonProperty("reserve_type")
	ReserveType reserveType;

	@JsonProperty("datetime_list")
	DatetimeList datetimeList;

}
