package com.example.spring.controller.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import lombok.SneakyThrows;

public class HotpepperTest {

	@RunWith(SpringRunner.class)
	@SpringBootTest
	public static class LargeServiceArea {

		public static final String URL = "/api/hotpepper/large-service-area";

		private MockMvc mockMvc;

		@Autowired
		Hotpepper api;

		@Before
		public void setup() {

			mockMvc = MockMvcBuilders.standaloneSetup(api).build();
		}

		@Test
		@SneakyThrows
		public void test() {

			// body empty json
			mockMvc.perform(post(URL).contentType(MediaType.APPLICATION_JSON).content("{}"))
					.andExpect(status().isOk())
					.andReturn();
		}

	}
}