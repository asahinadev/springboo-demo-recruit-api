package com.example.spring.webapi.abroadair.v1.responce.entity;

import java.util.Date;
import java.util.List;

import com.example.spring.common.MasterBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Ticket extends MasterBase {

	@JsonProperty("id")
	String id;
	@JsonProperty("title")
	String title;
	@JsonProperty("last_update")
	Date lastUpdate;
	@JsonProperty("airline")
	List<Airline> airlines;
	@JsonProperty("airline_type")
	String airlineType;
	@JsonProperty("airline_summary")
	String airlineSummary;
	@JsonProperty("mile")
	String mile;
	@JsonProperty("dept_detail")
	List<DeptDetail> deptDetails;
	@JsonProperty("city_number")
	CityNumber cityNumber;
	@JsonProperty("city")
	List<City> cities;
	@JsonProperty("term_min")
	String termMin;
	@JsonProperty("term_max")
	String termMax;
	@JsonProperty("seat_class")
	SeatClass seatClass;
	@JsonProperty("dept_time")
	DeptTime deptTime;
	@JsonProperty("trip_type")
	TripType tripType;
	@JsonProperty("kodawari")
	List<Kodawari> kodawaris;
	@JsonProperty("brand")
	Brand brand;
	@JsonProperty("urls")
	Urls urls;
	@JsonProperty("price")
	Price price;

	@Deprecated
	@JsonProperty("kodaw")
	public void setKodaw(List<Kodawari> kodawaris) {
		this.setKodawaris(kodawaris);
	}
}
