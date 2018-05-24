package com.mc;


import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestAWithSpring {
	
	@Test
	public void testSpring(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		A a = context.getBean(A.class);
		a.execute();
	}

}
