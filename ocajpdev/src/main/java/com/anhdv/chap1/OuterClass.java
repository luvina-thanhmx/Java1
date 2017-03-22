package com.anhdv.chap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class OuterClass {

	public String str = "OuterClass";
	public List<String> ls = new ArrayList<>();
	public static List<String> staticLs = new ArrayList<>();
	public static int x = 5;

	static class StaticNestedClass {
		public String str = "StaticNestedClass";
		public static int x = 5;

		public void testStaticNestedClass(String str) {
			//ls.add(str);
			staticLs.add(str);
			//testMethod1(str);
		}

	}

	class InnerClass {
		public String  str = "InnerClass";

		//public static int x = 5;

		public void testMethod(String str) {
			System.out.println("str1 = " + str);
			System.out.println("str2 = " + this.str);
			System.out.println("str3 = " + OuterClass.this.str);
			ls.add(str);
			staticLs.add(str);
			testMethod1(str);
		}
	}

	private void testMethod1(String str) {
		System.out.println("str1 = " + str);
		System.out.println("str2 = " + this.str);
		System.out.println("str3 = " + OuterClass.this.str);
		ls.add(str);
		staticLs.add(str);
	}

	public static void main(String[] args) {
		// if other class
		OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();

		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.testMethod(staticNestedClass.str);
		for (String item : outerClass.ls) {
			System.out.println(item);
		}

		// local class
		class Hello {
			public void print() {
				System.out.println("Hello");
			}
		}
		Hello hello = new Hello();
		hello.print();

		//outerClass.testMethod(staticNestedClass.str);
		// anonymous class
		Collections.sort(outerClass.ls, new Comparator<String>() {
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});;

		//in
		StaticNestedClass staticNestedClass1 = new StaticNestedClass();
		//InnerClass innerClass1 = new InnerClass();

	}


}

class abc {
	static public void main(String[] __A_V_) {

		String $ = "1";

		for (int x = 0; ++x < __A_V_.length;)

		$ +=__A_V_[x];

		System.out.println($);
	}
}
