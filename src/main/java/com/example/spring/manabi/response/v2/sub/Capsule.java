package com.example.spring.manabi.response.v2.sub;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Capsule extends MasterBase {

	@JsonProperty("category")
	Category category;

	@JsonProperty("capsule_type")
	CapsuleType capsuleType;

	@JsonProperty("shikaku_type")
	ShikakuType shikakuType;

	public void setShikakuType(String code) {
		ShikakuType c = new ShikakuType();
		c.setCode(code);
		this.setShikakuType(c);
	}

	public void setShikakuType(ShikakuType shikakuType) {
		this.shikakuType = shikakuType;
	}

	public void setCapsuleType(String code) {
		CapsuleType c = new CapsuleType();
		c.setCode(code);
		this.setCapsuleType(c);
	}

	public void setCapsuleType(CapsuleType capsuleType) {
		this.capsuleType = capsuleType;
	}
}
