package cn.zhou.inner;

public class InnerClassDemo {
	public static void main(String[] args) {
		System.out.println();
	}
}

class Outer {
	final int i = 1;
	static int j = 2;

	// int k = 10; //允许修改它的属性
	public void m1() {
		// int k = 3;
		class Inner1 extends Object implements Cloneable {
			int x = 0; // 非静态属性
			static final int y = 1; // 静态常量

			public void m() { // 非静态方法
				// k = 4; //方法内部类中使用局部变量是默认为常量，不可修改
				System.out.println(i);
				System.out.println(j);
			}
		}
		Inner1 in1 = new Inner1();
	}

	public void m2() {
		class Inner2 { // 方法内不允许在定义方法
			public void m() { // 复用该多行代码，且只能在该方法中使用
				// 10行代码
			}
		}

		Inner2 in2 = new Inner2();
		in2.m();
		// 其他代码
		in2.m();
	}

	public void m() {

	}
}