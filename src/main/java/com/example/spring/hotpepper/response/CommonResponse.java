package com.example.spring.hotpepper.response;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Data
public class CommonResponse<E extends CommonResponse.Item> {

	@JsonProperty("results")
	E results;

	@Getter
	@Setter
	public static class Item {
		String api_version;
		Integer results_available;
		Integer results_returned;
		Integer results_start;

		@Override
		@SneakyThrows
		public String toString() {
			return new ObjectMapper().writer().writeValueAsString(this);
		}

		@Override
		public boolean equals(Object obj) {
			return EqualsBuilder.reflectionEquals(this, obj);
		}

		@Override
		public int hashCode() {
			return HashCodeBuilder.reflectionHashCode(this);
		}
	}
}
