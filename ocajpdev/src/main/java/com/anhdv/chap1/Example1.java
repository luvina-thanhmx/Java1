package com.anhdv.chap1;

import static java.util.Locale.ENGLISH;

import java.util.Locale;

import com.anhdv.chap1.child.Example3;

public class Example1 {


	int $abc;
	int _xyz;
	///int new;


	//Locale test;
	//Locale test1 = Locale.CANADA;
	Locale defaultLocale = ENGLISH;
	protected String protectedVar = "test protected variable";

	public Example1() {

	}

	Example1(Locale locale) {
		this.defaultLocale = locale;
	}

	public void printLocale() {
		System.out.println(ENGLISH);
	}

	public static void main(String[] args) {
		System.out.println("Hello world");

		System.out.println("Hello " /*+ args[1]*/);

		Example1 ex = new Example1();
		ex.printLocale();
		System.out.println(ex.defaultLocale);
		System.out.println(ex.protectedVar);


	}

}
