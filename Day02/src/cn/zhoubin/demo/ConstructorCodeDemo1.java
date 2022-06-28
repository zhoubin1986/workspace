package cn.zhoubin.demo;

public class ConstructorCodeDemo1 {
	public static void main(String[] args) {
		A a = new A("abc");
	}
}

class A {
	{
		System.out.println("A1");
	}
	
	public A() {
		System.out.println("A2");
	}

	public A(int i) {
		this();
		System.out.println("A3");
	}

	public A(String str) {
		//this(8);
		A a = new A(6);
		System.out.println("A4");
	}
}
