package com.example.spring.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
@SuppressWarnings("serial")
public abstract class ResponseType<T extends ResponseType.Results>
		extends ParameterBase {

	@JsonProperty("results")
	T results;

	@Getter
	@Setter
	public static class Results extends ParameterBase {

		@JsonProperty("api_version")
		String apiVersion;

		@JsonProperty("results_returned")
		Long returned;

		@JsonProperty("results_start")
		Long start;

		@JsonProperty("results_available")
		Long available;

		@JsonProperty("error")
		@JsonDeserialize(using = ErrorsDeserializer.class)
		List<Error> error;
	}

	public static class ErrorsDeserializer extends JsonDeserializer<List<Error>> {

		@Override
		@SneakyThrows
		public List<Error> deserialize(JsonParser p, DeserializationContext ctxt)
				throws IOException, JsonProcessingException {

			ObjectMapper om = new ObjectMapper();

			List<Error> errors = new ArrayList<>();
			TreeNode node = p.getCodec().readTree(p);

			if (node.isValueNode()) {
				Error error = new Error();
				error.setMessage(node.toString());
				errors.add(error);
				return errors;
			} else if (node.isObject()) {
				Error error = om.readValue(node.toString(), Error.class);
				errors.add(error);
				return errors;
			} else if (node.isArray()) {
				return om.readValue(node.toString(), new TypeReference<List<Error>>() {
				});
			}
			return null;
		}

	}
}
