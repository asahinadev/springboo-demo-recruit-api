package com.example.spring.manabi.response.v2.sub;

import java.util.List;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class School extends MasterBase {

	@JsonProperty("name_kana")
	String kana;

	@JsonProperty("kyoten")
	List<Kyoten> kyotens;

}
