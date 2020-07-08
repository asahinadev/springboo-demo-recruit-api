package com.example.spring.carsensor.request;

import java.util.List;

import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsedcarRequest extends CommonRequest {
	String id;
	List<String> brand;
	List<String> model;
	List<String> country;
	List<String> large_area;
	List<String> pref;
	List<String> body;
	int person;
	List<String> color;
	int price_min;
	int price_max;
	String keyword;
	double lat = Double.NEGATIVE_INFINITY;
	double lng = Double.NEGATIVE_INFINITY;
	int range;
	String datum;
	int mission;
	int nonsmoking;
	int leather;
	int welfare;
	int year_old;
	int year_new;
	int odd_min;
	int odd_max;
	int order;
	int start;
	int count;

	public MultiValueMap<String, String> queries(String apiKey) {
		var queries = super.queries(apiKey);
		set(queries, "id", id);
		set(queries, "brand", brand);
		set(queries, "model", model);
		set(queries, "country", country);
		set(queries, "large_area", large_area);
		set(queries, "pref", pref);
		set(queries, "body", body);
		set(queries, "person", person);
		set(queries, "color", color);
		set(queries, "price_min", price_min);
		set(queries, "price_max", price_max);
		set(queries, "keyword", keyword);
		set(queries, "lat", lat);
		set(queries, "lng", lng);
		set(queries, "range", range);
		set(queries, "datum", datum);
		set(queries, "mission", mission);
		set(queries, "nonsmoking", nonsmoking);
		set(queries, "leather", leather);
		set(queries, "welfare", welfare);
		set(queries, "year_old", year_old);
		set(queries, "year_new", year_new);
		set(queries, "odd_min", odd_min);
		set(queries, "odd_max", odd_max);
		set(queries, "order", order);
		set(queries, "start", start);
		set(queries, "count", count);
		return queries;
	}
}
