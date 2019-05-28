package com.example.spring.manabi.response.v2.entity;

import java.io.IOException;

import com.example.spring.common.MasterBase;
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
public class Tokucho extends MasterBase {

	@JsonProperty("tktg_type")
	String tktgType;

	@JsonProperty("pickup")
	String pickup;

	@JsonProperty("tokucho_type")
	String tokuchoType;

	@JsonProperty("tokucho_group")
	TokuchoGroup group;

	static class Deserializer extends JsonDeserializer<Tokucho> {

		static final ObjectMapper om = new ObjectMapper();

		@Override
		public Tokucho deserialize(JsonParser p, DeserializationContext ctxt)
				throws IOException, JsonProcessingException {
			TreeNode node = p.getCodec().readTree(p);
			if (node.isValueNode()) {
				Tokucho result = new Tokucho();
				result.setName(node.toString());
				return result;
			} else if (node.isObject()) {
				return om.readValue(node.toString(), Tokucho.class);
			}
			return null;
		}

	}

}
