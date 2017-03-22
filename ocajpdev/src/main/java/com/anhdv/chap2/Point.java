package com.anhdv.chap2;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void  testMethod(Point point, int x, int y) {
		point.x = x;
		point.y = y;
	}

	public void testMethod2(Point point) {
		point.x = x;
		point.y = y;
	}

	public static void main(String[] args) {
		Point point0 = new Point(0, 0);
		Point point1 = new Point(1, 1);

		point1.testMethod(point0, 3, 3);
		System.out.println(point0);
		System.out.println(point1);

		point0.testMethod2(point1);
		System.out.println(point0);
		System.out.println(point1);
	}

	@Override
	public String toString() {
		return "x = " +  x + " | y = " + y + ", hashcode =  " + this.hashCode();
	}
}


class xxx{

}
