package com.anhdv.chap1;

public class Example4 {
	static Example1 ex;
	static {
		ex = new Example1();
	}
	static int x = 10;
	static int a;
	public static void main(String[] args) {
		System.out.println(ex.protectedVar);

		for(int x=0;x<5;x++){
		}

		System.out.print(a);

		/*int a =1;
		boolean b = false;
		if (b.equals(1)) {

		}*/
	}

}
