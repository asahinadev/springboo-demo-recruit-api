package com.example.spring.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.spring.carsensor.request.BodyRequest;
import com.example.spring.carsensor.request.BrandRequest;
import com.example.spring.carsensor.request.CatalogRequest;
import com.example.spring.carsensor.request.ColorRequest;
import com.example.spring.carsensor.request.CountryRequest;
import com.example.spring.carsensor.request.LargeAreaRequest;
import com.example.spring.carsensor.request.PrefRequest;
import com.example.spring.carsensor.request.UsedcarRequest;
import com.example.spring.carsensor.response.BodyResponse;
import com.example.spring.carsensor.response.BrandResponse;
import com.example.spring.carsensor.response.CatalogResponse;
import com.example.spring.carsensor.response.ColorResponse;
import com.example.spring.carsensor.response.CountryResponse;
import com.example.spring.carsensor.response.LargeAreaResponse;
import com.example.spring.carsensor.response.PrefResponse;
import com.example.spring.carsensor.response.UsedcarResponse;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/carsensor")
public class CarsensorController extends CommonController {

	@Autowired
	WebClient carsensor;

	@GetMapping("usedcar")
	public Mono<UsedcarResponse> get(UsedcarRequest request) {
		log.debug("request => {}", request);
		return get(carsensor, "usedcar/v1/", request.queries(config.getKey()), UsedcarResponse.class);
	}

	@GetMapping("catalog")
	public Mono<CatalogResponse> get(CatalogRequest request) {
		log.debug("request => {}", request);
		return get(carsensor, "catalog/v1/", request.queries(config.getKey()), CatalogResponse.class);
	}

	@GetMapping("brand")
	public Mono<BrandResponse> get(BrandRequest request) {
		log.debug("request => {}", request);
		return get(carsensor, "brand/v1/", request.queries(config.getKey()), BrandResponse.class);
	}

	@GetMapping("country")
	public Mono<CountryResponse> get(CountryRequest request) {
		log.debug("request => {}", request);
		return get(carsensor, "country/v1/", request.queries(config.getKey()), CountryResponse.class);
	}

	@GetMapping("large_area")
	public Mono<LargeAreaResponse> get(LargeAreaRequest request) {
		log.debug("request => {}", request);
		return get(carsensor, "large_area/v1/", request.queries(config.getKey()), LargeAreaResponse.class);
	}

	@GetMapping("pref")
	public Mono<PrefResponse> get(PrefRequest request) {
		log.debug("request => {}", request);
		return get(carsensor, "pref/v1/", request.queries(config.getKey()), PrefResponse.class);
	}

	@GetMapping("body")
	public Mono<BodyResponse> get(BodyRequest request) {
		log.debug("request => {}", request);
		return get(carsensor, "body/v1/", request.queries(config.getKey()), BodyResponse.class);
	}

	@GetMapping("color")
	public Mono<ColorResponse> get(ColorRequest request) {
		log.debug("request => {}", request);
		return get(carsensor, "color/v1/", request.queries(config.getKey()), ColorResponse.class);
	}
}
