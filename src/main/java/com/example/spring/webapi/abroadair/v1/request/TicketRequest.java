package com.example.spring.webapi.abroadair.v1.request;

import java.util.List;

import com.example.spring.common.RequestType;
import com.example.spring.common.values.Order;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class TicketRequest extends RequestType {

	@JsonProperty("id")
	List<String> ids;
	@JsonProperty("area")
	List<String> areas;
	@JsonProperty("zone")
	List<String> zones;
	@JsonProperty("country")
	List<String> countries;
	@JsonProperty("city")
	List<String> cities;
	@JsonProperty("keyword")
	String keyword;
	@JsonProperty("keyword_or")
	List<String> keywordOr;
	@JsonProperty("dept")
	List<String> depts;
	@JsonProperty("dept_detail")
	List<String> deptDetails;
	@JsonProperty("ym")
	Integer month;
	@JsonProperty("ymd")
	Integer date;
	@JsonProperty("price_min")
	Integer priceMin;
	@JsonProperty("price_max")
	Integer priceMax;
	@JsonProperty("term_min")
	Integer termMin;
	@JsonProperty("term_max")
	Integer termMax;
	@JsonProperty("seat_class")
	List<String> seatClass;
	@JsonProperty("dept_time")
	List<String> deptTime;
	@JsonProperty("trip_type")
	List<String> tripType;
	@JsonProperty("airline")
	List<String> airline;
	@JsonProperty("kodaw")
	List<String> kodaw;
	@JsonProperty("order")
	Order order;
}
