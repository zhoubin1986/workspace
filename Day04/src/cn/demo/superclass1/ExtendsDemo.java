package cn.demo.superclass1;

public class ExtendsDemo {
	public static void main(String[] args) {
		new B();  //匿名对象，没取名字而已
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
		System.out.println("B2");  //构造方法块一定是最后执行的
	}
	{
		System.out.println("B1");
	}
	A a = new A();

}