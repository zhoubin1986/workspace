package cn.zhou.finalx;

public class FinalDemo1 {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.m();
	}
}

class Demo1 {
	public final void m() {
		System.out.println("A");
	}
	
	public final void m(int i) {
		System.out.println("C");
	}
} 

class Demo2 extends Demo1 {
	public final void m(int i,String name) {  //���ܹ�����д,���Ա��̳�
		System.out.println("B");
	}
}

