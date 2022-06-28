package cn.demo.static1;

public class StaticDemo2 {
	static String name;
	static {
		System.out.println("*****" + name);
	}
	
	public static void ss() {
		System.out.println("ss");
	}
	
	public StaticDemo2() {
		System.out.println("++++++");
	}
	public static void main(String[] args) {
//		StaticDemo2 a; //声明->static(本类中), new对象->构造方法、初始化代码块
		new StaticDemo2();
//		new M();
//		new N();
//		new N();  //不是第一次
		P.p();  //声明先栈区占地
//		P p = new P();
//		p.p();
//		p.p();
	}
}

class M {
	static {
		System.out.println("M1---static");
	}
	static M m = new M();  //类只加载一次，静态代码块也只执行一次，加了static后，new M();初始化工作->有static，类不加载了
	{
		System.out.println("M1");
	}
	
	public M() {
		System.out.println("M2");
	}
}

class N {
	static {
		System.out.println("static----");
	}
}

class P {
	static {
		System.out.println("P->static");
	}
	
	public P() {
		System.out.println("P->构造方法");
	}
	public static void p() {
		System.out.println("p()");
	}
}


