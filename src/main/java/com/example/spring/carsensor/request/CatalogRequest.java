package com.example.spring.carsensor.request;

import java.util.List;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CatalogRequest extends CommonRequest {

	String id;
	List<String> brand;
	List<String> model;
	List<String> country;
	List<String> body;
	int person;
	int year_old;
	int year_new;
	int welfare;
	String series;
	String keyword;
	int width_max;
	int height_max;
	int length_max;
	int order;
	int start;
	int count;

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		set(queries, "id", id);
		set(queries, "brand", brand);
		set(queries, "model", model);
		set(queries, "country", country);
		set(queries, "body", body);
		set(queries, "person", person);
		set(queries, "year_old", year_old);
		set(queries, "year_new", year_new);
		set(queries, "welfare", welfare);
		set(queries, "series", series);
		set(queries, "keyword", keyword);
		set(queries, "width_max", width_max);
		set(queries, "height_max", height_max);
		set(queries, "length_max", length_max);
		set(queries, "order", order);
		set(queries, "start", start);
		set(queries, "count", count);
		return queries;
	}
}
