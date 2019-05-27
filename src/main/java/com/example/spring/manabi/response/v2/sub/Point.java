package com.example.spring.manabi.response.v2.sub;

import java.util.HashMap;
import java.util.Map;

import com.example.spring.common.ParameterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Point extends ParameterBase {

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

	@JsonProperty("read")
	String read;

	@JsonProperty("catch")
	String catchCopy;
}
