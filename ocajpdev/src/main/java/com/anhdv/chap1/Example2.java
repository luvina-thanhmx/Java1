package com.anhdv.chap1;

public class Example2 {

	public static void main(String[] args) {
		Example1 ex = new Example1();
		Example1.main(args);
		ex.main(args);
		System.out.println(ex.protectedVar);
	}

}
