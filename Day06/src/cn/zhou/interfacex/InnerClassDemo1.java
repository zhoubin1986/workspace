package cn.zhou.interfacex;

public class InnerClassDemo1 {
	public static void main(String[] args) {
//		Outer_2 out_2 = new Outer_2();
//		out_2.mm();
		Outer_2.Inner_2 oi = new Outer_2().new Inner_2();
		oi.m();  //成员内部类直接调用
	}
}

class Outer_2 {
	int k = 3;

	class Inner_2 extends Object implements Cloneable {
		int k = 5;
		static final int j = 1;

		public void m() {
			System.out.println(k);  //就近原则
			System.out.println(this.k);
			System.out.println(Outer_2.this.k); //调外部类
		}
	}

	public void mm() {  //成员内部类间接使用
		Inner_2 in_2 = new Inner_2();
		in_2.m();
	}
}

//class Outer_3 {
//	// Inner_2 in_3 = new Inner_2();
//	public void mmm() {
////		Inner_2 in_3 = new Inner_2();
//	}
//}