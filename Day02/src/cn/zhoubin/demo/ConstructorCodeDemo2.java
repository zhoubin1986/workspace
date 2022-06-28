package cn.zhoubin.demo;

public class ConstructorCodeDemo2 {
	public static void main(String[] args) {
//		B b = new B();
	}
}

class B {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	B b = new B();

	public B() {
		System.out.println("B");
	}
}