package cn.demo.static1;

public class StaticDemo1 {
	public static void main(String[] args) {
		A a = new B(); //向上造型创建对象，声明+实例
		a.m1();
		a.m2();
	}
}

class A {
	public static void m1() {
		System.out.println("A->m1");
	}
	
	public void m2() {
		System.out.println("A->m2");
	}
}

class B extends A{
	public static void m1() {
		System.out.println("B->m1");
	}
	
	public void m2() {
		System.out.println("B->m2");
	}
}