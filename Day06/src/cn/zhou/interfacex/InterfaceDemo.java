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
	int age = 0; // ��Ч��public static final int age = 0;

	void eat();

	void sleep(); // ��ͨ�Ľӿڳ�Ա����

	double sum(double i, double j);

	public default double Max(double i, double j) { // ʵ�巽��������default/static����
		return i > j ? i : j;
	}

	public static double Min(double i, double j) {
		return i < j ? i : j;
	}
}

class Cat implements Pet, Cloneable {
	int age = 10;

	@Override
	public void eat() { // ������д���󷽷�

	} // ʵ�巽��

	@Override
	public void sleep() { // ������д���󷽷�

	}

	@Override
	public double sum(double i, double j) { // ������д���󷽷�
		return 0.0;
	}

}

interface A {
	void m(); // ����ʡ��public abstract ���η�
}

class B implements A {
	// void m(){} //��С��Ȩ�����η���ΧΪĬ�ϣ���д���ڵ���
	public void m() {
	}
}