package com.anhdv.chap1;

public class Example4 {
	static Example1 ex;
	static {
		ex = new Example1();
	}
	static int x = 10;
	public static void main(String[] args) {
		System.out.println(ex.protectedVar);

		for(int x=0;x<5;x++){
		}
		System.out.print(x);
	}

}
