package com.jdc.spring;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdc.beans.Bean1;

public class Bean1Test {
	
	private static ConfigurableApplicationContext container;
	private Bean1 bean;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		container = new ClassPathXmlApplicationContext("application-config.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		container.close();
	}

	@Before
	public void setUp() throws Exception {
		bean = container.getBean("bean1", Bean1.class);
	}

	@Test
	public void testSayHello() {
		String result = bean.sayHello("Min Lwin");
		System.out.println(result);
		assertEquals("Hello from Spring : Min Lwin", result);
	}

}
