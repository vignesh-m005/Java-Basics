package com.java.oops.staticblock;

import com.java.oops.instancecontrolflow.InstanceControl;

public class StaticFlowControl {
	
	static int x = 10;
	
	static {
		m1();
		System.out.println("First static block");
		// System.out.println(j);  we can't perform direct read when j is RIWO state.
	}

	public static void main(String[] args) {
		m1();
		System.out.println("main method");
		// InstanceControl in = new InstanceControl(); for instance control flow check
	}
	
	public static void m1() {
		System.out.println(j);
		j = x;
	}
	static int j = 20;
	static {
		m1();
		System.out.println("Second static block");
	}
}

