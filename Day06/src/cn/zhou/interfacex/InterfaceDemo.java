package cn.zhou.interfacex;

import java.io.Serializable;

public class InterfaceDemo {
	public static void main(String[] args) {
		Cat c = new Cat();
		double d = c.Max(0.2, 0.3);
		double d1 = c.sum(0.2, 0.3);
		System.out.println(d);
		System.out.println(d1);
	}
}

interface Pet extends Serializable {
	int age = 0; // 等效于public static final int age = 0;

	void eat();

	void sleep(); // 普通的接口成员方法

	double sum(double i, double j);

	public default double Max(double i, double j) { // 实体方法必须用default/static修饰
		return i > j ? i : j;
	}

	public static double Min(double i, double j) {
		return i < j ? i : j;
	}
}

class Cat implements Pet, Cloneable {
	int age = 10;

	@Override
	public void eat() { // 必须重写抽象方法

	} // 实体方法

	@Override
	public void sleep() { // 必须重写抽象方法

	}

	@Override
	public double sum(double i, double j) { // 必须重写抽象方法
		return 0.0;
	}

}

interface A {
	void m(); // 可以省略public abstract 修饰符
}

class B implements A {
	// void m(){} //减小了权限修饰符范围为默认，重写大于等于
	public void m() {
	}
}