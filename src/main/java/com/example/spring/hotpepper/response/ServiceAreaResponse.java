package com.example.spring.hotpepper.response;

import java.util.List;

import com.example.spring.hotpepper.dto.ServiceArea;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName("results")
public class ServiceAreaResponse
	extends CommonResponse<ServiceAreaResponse.Item> {

	@Getter
	@Setter
	public static class Item extends CommonResponse.Item {
		List<ServiceArea> service_area;
	}
}
