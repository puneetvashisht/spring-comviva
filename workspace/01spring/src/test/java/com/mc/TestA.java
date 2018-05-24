package com.mc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestA {

	@Test
	public void test() {
//		B b = new B();
		C c = new C();
		
		A a = new A(b ,c);
		a.execute();
	}

}
