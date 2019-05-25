package com.example.spring.hotpepper.values;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Coupon {
	Y("0", "有"),
	N("1", "無"),
	@JsonEnumDefaultValue
	A("", "どちらでも");

	final String id;
	final String label;

	@Override
	@JsonDeserialize
	public String toString() {
		return getId();
	}

	@JsonCreator
	public static Coupon fromValue(String id) {
		return Arrays.asList(values()).stream().filter(
				v -> Objects.equals(v.toString(), id))
				.findFirst().orElse(Coupon.A);
	}
}