package com.example.spring.webapi.carsensor.v1.responce;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.webapi.carsensor.v1.responce.entity.Catalog;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class CatalogResponse extends ResponseType<CatalogResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("catalog")
		List<Catalog> catalogs;

	}

}
