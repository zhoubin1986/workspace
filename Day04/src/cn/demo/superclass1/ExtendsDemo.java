package cn.demo.superclass1;

public class ExtendsDemo {
	public static void main(String[] args) {
		new B();  //��������ûȡ���ֶ���
	}
}

class A {
	{
		System.out.println("A1");
	}

	public A() {
		System.out.println("A2");
	}
}

class B extends A {
	public B() {
		System.out.println("B2");  //���췽����һ�������ִ�е�
	}
	{
		System.out.println("B1");
	}
	A a = new A();

}