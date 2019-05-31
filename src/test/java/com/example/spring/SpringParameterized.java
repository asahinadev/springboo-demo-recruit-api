package com.example.spring;

import org.junit.ClassRule;
import org.junit.Rule;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

public class SpringParameterized {

	@ClassRule
	public static final SpringClassRule CLASS_RULE = new SpringClassRule();

	@Rule
	public final SpringMethodRule rule = new SpringMethodRule();
}
