package com.example.spring;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.common.ApiBase;
import com.example.spring.common.RequestType;
import com.example.spring.common.ResponseType;
import com.example.spring.config.RecruitApiConfig;

public abstract class ApiTest<
// @formatter:off
API  extends ApiBase<IN,OUT>, 
IN   extends RequestType, 
OUT  extends ResponseType<?>
//@formatter:on
> extends SpringParameterized {

	protected abstract API api();

	protected abstract Logger logger();

	protected abstract void setParameter();

	@Autowired
	protected RecruitApiConfig config;

	protected IN request;

	protected OUT response;

	@After
	public final void after() {
		logger().info("{}", response);
	}

	@Before
	public final void before() {
		setParameter();
		logger().info("{}", request);
	}

	@Test
	public final void testAccept() {
		response = api().accept(request);
		assertNotNull(response);
	}

	@SuppressWarnings("unchecked")
	protected static <E> List<E> $(final E... parameters) {
		return Arrays.asList(parameters);
	}
}
