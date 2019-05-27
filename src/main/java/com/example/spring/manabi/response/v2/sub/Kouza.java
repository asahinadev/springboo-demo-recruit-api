package com.example.spring.manabi.response.v2.sub;

import java.util.Map;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Kouza extends MasterBase {

	@JsonProperty("juko_price")
	Double jukoPrice;

	@JsonProperty("photo")
	@JsonDeserialize(using = Urls.Deserializer.class)
	Urls photo;

	@JsonProperty("kaisu")
	String kaisu;

	@JsonProperty("term")
	String term;

	@JsonProperty("catch")
	String catchCopy;

	@JsonProperty("shiryo_no")
	String shiryoNo;

	@JsonProperty("shiryo_flg")
	String shiryoFlg;

	@JsonProperty("point_title")
	String pointTitle;

	@JsonProperty("read")
	String read;

	@JsonProperty("spec")
	Map<String, Object> spec;

	@JsonProperty("capsule_list")
	CapsuleList capsuleList;

	@JsonProperty("shiryo_url")
	Urls shiryoUrl;

	@JsonProperty("photo_kyouzai")
	Urls photoKyouzai;

	@JsonProperty("photo_main")
	Urls photoMain;

	@JsonProperty("url")
	Urls url;

	@JsonProperty("point_list")
	PointList pointList;

	@JsonProperty("tokucho_group_list")
	TokuchoGroupList tokuchoGroupList;

	@JsonProperty("tokushu_list")
	TokushuList tokushuList;

	@JsonProperty("school")
	School school;

	@JsonProperty("kaiko_list")
	KaikoList kaikoList;

	@JsonProperty("profile")
	Profile profile;

	@JsonProperty("curriculum")
	String curriculum;

}
