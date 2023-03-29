package com.java.oops.inheritance;

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		//p.m2();
		Child c  = new Child();
		c.m1();
		c.m2();
		
		
		Parent obj1 = new Child();
		//Child obj2 = new Parent();  -- invalid
		
		obj1.m1();
		//obj1.m2();  
	}

}
