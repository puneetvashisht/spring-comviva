package com.mc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	@Autowired
	B b;
	
	@Autowired
	C c;
	
	A(){
		
	}
	
	A(B b, C c){
		this.b = b;
		this.c = c;
	}
	
	public void execute(){
		b.execute();
		c.execute();
		System.out.println("Execute in A class");
	}

}
