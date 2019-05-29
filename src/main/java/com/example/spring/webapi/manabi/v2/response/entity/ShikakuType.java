package com.example.spring.webapi.manabi.v2.response.entity;

import java.io.IOException;

import com.example.spring.common.MasterBase;
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
public class ShikakuType extends MasterBase {

	static class Deserializer extends JsonDeserializer<ShikakuType> {

		static final ObjectMapper om = new ObjectMapper();

		@Override
		public ShikakuType deserialize(JsonParser p, DeserializationContext ctxt)
				throws IOException, JsonProcessingException {

			TreeNode node = p.getCodec().readTree(p);
			if (node.isValueNode()) {
				ShikakuType result = new ShikakuType();
				result.setCode(node.toString());
				return result;
			} else if (node.isObject()) {
				return om.readValue(node.toString(), ShikakuType.class);
			}
			return null;
		}

	}

}
