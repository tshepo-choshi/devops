package com.devops.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;


	@Test
	void contextLoads() {
	}


	@Test
	public void testdevOps() throws Exception {
		String name = "Tshepo";

		mockMvc.perform(MockMvcRequestBuilders.get("/devops/{name}", name))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Welcome to devops for developers: " + name));
	}

}
