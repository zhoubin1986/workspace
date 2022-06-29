package cn.demo.static1;

public class StaticDemo6 {
	public static void main(String[] args) {
		Farther f = new Son();   //向上造型
		f.m();  /*虽然f指向的是一个子类对象，但是依然调用的是父类的类方法。
			        甚至在f指向一个空对象null的时候，也能够成功调用m().
			        所以和f指向哪个对象无关，只和f的类型有关系。
			        当然，也不建议通过对象去调用类方法，而应该直接通过类去调用类方法，从而规避理解上的歧义。 */
		Son.m();
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
