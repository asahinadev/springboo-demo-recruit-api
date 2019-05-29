package com.example.spring.webapi.abroadair.v1.responce;

import java.util.List;

import com.example.spring.common.ResponseType;
import com.example.spring.webapi.abroadair.v1.responce.entity.Kodawari;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class KodawariResponse extends ResponseType<KodawariResponse.Results> {

	@Getter
	@Setter
	public static class Results extends ResponseType.Results {

		@JsonProperty("kodawari")
		List<Kodawari> kodawaris;

		@Deprecated
		@JsonProperty("kodaw")
		public void setKodaw(List<Kodawari> kodawaris) {

			this.setKodawaris(kodawaris);
		}

	}

}
