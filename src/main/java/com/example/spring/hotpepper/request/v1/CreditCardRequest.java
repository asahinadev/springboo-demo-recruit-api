package com.example.spring.hotpepper.request.v1;

import org.springframework.util.MultiValueMap;

import com.example.spring.common.RequestType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CreditCardRequest extends RequestType {

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		// nop

		return map;
	}

}
