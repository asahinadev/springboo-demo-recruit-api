package com.example.spring.hotpepper.request.v1;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.example.spring.common.RequestType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class SpecialRequest extends RequestType {

	@JsonProperty("special")
	List<String> specials;

	@JsonProperty("special_category")
	List<String> specialCategories;

	public MultiValueMap<String, String> convert() {
		MultiValueMap<String, String> map = super.convert();

		add(map, "special", specials);
		add(map, "special_category", specialCategories);

		return map;
	}

}
