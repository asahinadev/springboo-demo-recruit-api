package com.example.spring.webapi.manabi.v2.response.entity;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.example.spring.common.MasterBase;
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
public class Urls extends MasterBase {

	@JsonProperty("caption")
	String caption;

	@JsonAnySetter
	Map<String, String> urls = new HashMap<>();

	static class Deserializer extends JsonDeserializer<Urls> {

		static final ObjectMapper om = new ObjectMapper();

		@Override
		public Urls deserialize(JsonParser p, DeserializationContext ctxt)
				throws IOException, JsonProcessingException {

			TreeNode node = p.getCodec().readTree(p);
			if (node.isValueNode()) {
				Urls result = new Urls();
				result.urls.put("large", node.toString());
				result.urls.put("small", node.toString());
				return result;
			} else if (node.isObject()) {
				return om.readValue(node.toString(), Urls.class);
			}
			return null;
		}

	}
}
