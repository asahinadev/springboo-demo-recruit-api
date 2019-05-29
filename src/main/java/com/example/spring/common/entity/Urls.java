package com.example.spring.common.entity;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Urls extends ParameterBase {

	@JsonProperty("caption")
	String caption;

	@JsonAnySetter
	Map<String, String> urls;

	public static class Deserializer extends JsonDeserializer<Urls> {

		static final ObjectMapper om = new ObjectMapper();

		@Override
		public Urls deserialize(JsonParser p, DeserializationContext ctxt)
				throws IOException, JsonProcessingException {

			TreeNode node = p.getCodec().readTree(p);

			if (node.isValueNode()) {

				Urls result = new Urls();
				result.setUrls(new HashMap<>());

				Arrays.asList("default").stream().forEach(name -> {
					result.urls.put(name, node != null ? node.toString() : "");
				});

				return result;

			} else if (node.isObject()) {

				return om.readValue(node.toString(), Urls.class);

			}
			return null;
		}

	}

}
