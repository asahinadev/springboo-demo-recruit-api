package com.example.spring.manabi.request.v2;

import org.springframework.util.MultiValueMap;

import com.example.spring.common.RequestType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class AreaRequest extends RequestType {

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		// nop

		return map;
	}

}
