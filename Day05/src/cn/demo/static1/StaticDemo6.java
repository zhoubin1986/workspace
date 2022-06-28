package cn.demo.static1;

public class StaticDemo6 {
	public static void main(String[] args) {
		Son s = new Son();
		s.m();
	}
}


class Farther {
	public static void m() {
		System.out.println("Farther->m");
	}
}

class Son extends Farther {
	public static void m() {
		System.out.println("Son->m");
	}
}
