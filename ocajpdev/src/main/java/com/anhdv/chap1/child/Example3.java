package com.anhdv.chap1.child;

import com.anhdv.chap1.Example1;

public class Example3 extends Example1 {

	protected int a = 3;
	public static void main(String[] args) {
		Example1 ex = new Example1();
		//ex.main(args);
		//System.out.println(ex.protectedVar); // > no errors 2-2

		//System.out.println(this.protectedVar); // > no errors

		Example3 ex1 = new Example3();
		//System.out.println(ex1.defaultLocale); // errors
		System.out.println(ex1.protectedVar);
	}
}
