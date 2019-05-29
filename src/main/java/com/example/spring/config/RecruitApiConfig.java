package com.example.spring.config;

import java.net.URI;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Configuration
@ConfigurationProperties(prefix = "recruit-api")
public class RecruitApiConfig {

	String key;

	Hotpepper hotpepper;

	Manabi manabi;

	Carcensor carcensor;

	Abroadair abroadair;

	Abroad abroad;

	@Data
	public static class Hotpepper {

		URI gourmet;

		URI shop;

		URI budget;

		URI largeServiceArea;

		URI serviceArea;

		URI largeArea;

		URI middleArea;

		URI smallArea;

		URI genre;

		URI creditCard;

		URI special;

		URI specialCategory;
	}

	@Data
	public static class Manabi {

		URI schoolKyoten;

		URI event;

		URI kouza;

		URI tsushin;

		URI tokucho;

		URI area;

		URI prefecture;

		URI city;

		URI along;

		URI station;

		URI category;

		URI capsule;

		URI subCapsule;

		URI tokushu;

		URI genre;

		URI shikakuType;

		URI capsuleType;
	}

	@Data
	public static class Carcensor {

		URI usedcar;

		URI catalog;

		URI brand;

		URI country;

		URI largeArea;

		URI prefecture;

		URI color;

		URI body;
	}

	@Data
	public static class Abroad {

		URI tour;

		URI area;

		URI country;

		URI city;

		URI hotel;

		URI airline;

		URI kodawari;

		URI spot;

		URI osusume;

		URI theme;

		URI tourTally;
	}

	@Data
	public static class Abroadair {

		URI ticket;

		URI area;

		URI zone;

		URI country;

		URI city;

		URI deptDetail;

		URI airline;

		URI kodawari;
	}

}