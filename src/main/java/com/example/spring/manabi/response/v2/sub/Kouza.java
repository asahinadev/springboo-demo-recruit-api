package com.example.spring.manabi.response.v2.sub;

import java.util.HashMap;
import java.util.Map;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Kouza extends MasterBase {

	@JsonProperty("juko_price")
	Double jukoPrice;

	@JsonProperty("photo")
	Urls photo;

	public void setPhoto(String url) {
		Map<String, String> map = new HashMap<>();
		map.put("large", url);
		map.put("small", url);

		Urls photo = new Urls();
		photo.setUrls(map);
		this.setPhoto(photo);
	}

	public void setPhoto(Urls photo) {
		this.photo = photo;
	}

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
	Map<String, Object> spec;//	capsule_list: {},

	@JsonProperty("url")
	Urls url;

	@JsonProperty("point_list")
	PointList pointList;

	@JsonProperty("tokucho_group_list")
	TokuchoGroupList tokuchoGroupList;

	@JsonProperty("school")
	School school;

	//	kaiko_list: { },

}
