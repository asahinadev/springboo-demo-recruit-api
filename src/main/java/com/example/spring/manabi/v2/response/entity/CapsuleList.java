package com.example.spring.manabi.v2.response.entity;

import java.util.List;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CapsuleList extends MasterBase {

	@JsonProperty("capsule")
	List<Capsule> capsules;
}
