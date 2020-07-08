package com.example.spring.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.spring.config.ApiConfig;
import com.example.spring.hotpepper.request.BudgetRequest;
import com.example.spring.hotpepper.request.CreditCardRequest;
import com.example.spring.hotpepper.request.GenreRequest;
import com.example.spring.hotpepper.request.GourmetRequest;
import com.example.spring.hotpepper.request.LargeAreaRequest;
import com.example.spring.hotpepper.request.LargeServiceAreaRequest;
import com.example.spring.hotpepper.request.MiddleAreaRequest;
import com.example.spring.hotpepper.request.ServiceAreaRequest;
import com.example.spring.hotpepper.request.ShopRequest;
import com.example.spring.hotpepper.request.SmallAreaRequest;
import com.example.spring.hotpepper.request.SpecialCategoryRequest;
import com.example.spring.hotpepper.request.SpecialRequest;
import com.example.spring.hotpepper.response.BudgetResponse;
import com.example.spring.hotpepper.response.CreditCardResponse;
import com.example.spring.hotpepper.response.GenreResponse;
import com.example.spring.hotpepper.response.GourmetResponse;
import com.example.spring.hotpepper.response.LargeAreaResponse;
import com.example.spring.hotpepper.response.LargeServiceAreaResponse;
import com.example.spring.hotpepper.response.MiddleAreaResponse;
import com.example.spring.hotpepper.response.ServiceAreaResponse;
import com.example.spring.hotpepper.response.ShopResponse;
import com.example.spring.hotpepper.response.SmallAreaResponse;
import com.example.spring.hotpepper.response.SpecialCategoryResponse;
import com.example.spring.hotpepper.response.SpecialResponse;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/hotpepper")
public class HotpepperController {

	@Autowired
	ApiConfig config;

	@Autowired
	WebClient hotpepper;

	public <E> Mono<E> get(WebClient client,
			String path, MultiValueMap<String, String> params,
			Class<E> clazz) {

		return client.get()
				.uri(b -> b.path(path).queryParams(params).build())
				.accept(MediaType.APPLICATION_JSON,
						MediaType.valueOf("text/javascript;charset=UTF-8"))
				.retrieve()
				.bodyToMono(clazz);
	}

	@GetMapping("gourmet")
	public Mono<GourmetResponse> get(GourmetRequest request) {
		return get(hotpepper, "gourmet/v1/", request.queries(config.getKey()), GourmetResponse.class);
	}

	@GetMapping("shop")
	public Mono<ShopResponse> get(ShopRequest request) {
		return get(hotpepper, "shop/v1/", request.queries(config.getKey()), ShopResponse.class);
	}

	@GetMapping("budget")
	public Mono<BudgetResponse> get(BudgetRequest request) {
		return get(hotpepper, "budget/v1/", request.queries(config.getKey()), BudgetResponse.class);
	}

	@GetMapping("large_service_area")
	public Mono<LargeServiceAreaResponse> get(LargeServiceAreaRequest request) {
		return get(hotpepper, "large_service_area/v1/", request.queries(config.getKey()), LargeServiceAreaResponse.class);
	}

	@GetMapping("service_area")
	public Mono<ServiceAreaResponse> get(ServiceAreaRequest request) {
		return get(hotpepper, "service_area/v1/", request.queries(config.getKey()), ServiceAreaResponse.class);
	}

	@GetMapping("large_area")
	public Mono<LargeAreaResponse> get(LargeAreaRequest request) {
		return get(hotpepper, "large_area/v1/", request.queries(config.getKey()), LargeAreaResponse.class);
	}

	@GetMapping("middle_area")
	public Mono<MiddleAreaResponse> get(MiddleAreaRequest request) {
		return get(hotpepper, "middle_area/v1/", request.queries(config.getKey()), MiddleAreaResponse.class);
	}

	@GetMapping("small_area")
	public Mono<SmallAreaResponse> get(SmallAreaRequest request) {
		return get(hotpepper, "small_area/v1/", request.queries(config.getKey()), SmallAreaResponse.class);
	}

	@GetMapping("genre")
	public Mono<GenreResponse> get(GenreRequest request) {
		return get(hotpepper, "genre/v1/", request.queries(config.getKey()), GenreResponse.class);
	}

	@GetMapping("credit_card")
	public Mono<CreditCardResponse> get(CreditCardRequest request) {
		return get(hotpepper, "credit_card/v1/", request.queries(config.getKey()), CreditCardResponse.class);
	}

	@GetMapping("special")
	public Mono<SpecialResponse> get(SpecialRequest request) {
		return get(hotpepper, "special/v1/", request.queries(config.getKey()), SpecialResponse.class);
	}

	@GetMapping("special_category")
	public Mono<SpecialCategoryResponse> get(SpecialCategoryRequest request) {
		log.debug("request => {}", request);
		return get(hotpepper, "special_category/v1/", request.queries(config.getKey()), SpecialCategoryResponse.class);

	}
}
