package cn.zhou.abstrackx;

//不断抽取提炼过程

public class DemoTest {

}

abstract class Shape {
	private final double x;
	private final double y;

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public abstract double getGirth();

	public abstract double getArea();
}

// 1---------
class Rectangle extends Shape {

	public Rectangle(double x, double y) {
		super(x, y);
	}

	public double getGirth() {
		return 2 * (getX() + getY());
	}

	public double getArea() {
		return 0.0;
	}
}

class Square extends Rectangle { // 特殊的矩形

	public Square(double x) {
		super(x, x);
	}
}

// 2--------
class Ellipse extends Shape {

	public Ellipse(double x, double y) {
		super(x, y);
	}

	public double getGirth() {
		return 0.0;
	}

	public double getArea() {
		return 0.0;
	}
}

class Circle extends Ellipse {
	public Circle(double r) {
		super(r, r);
	}
}