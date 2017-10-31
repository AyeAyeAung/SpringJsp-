package com.jdc.spring;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdc.beans.Bean2;

public class Bean2Test {

	private static ConfigurableApplicationContext context;
	
	private Bean2 bean21;
	private Bean2 bean22;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("application-config.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Before
	public void setUp() throws Exception {
		bean21 = context.getBean("bean2-1", Bean2.class);
		bean22 = context.getBean("bean2-2", Bean2.class);
	}

	@Test
	public void test() {
		assertEquals("Aung Aung", bean21.getName());
		assertEquals("Maung Maung", bean22.getName());
	}

}
