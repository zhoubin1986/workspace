package cn.zhou.inner;

public class StaticInnerClassDemo {
	Outer_1.Inner_1 oi1 = new Outer_1.Inner_1(); //��̬�ڲ��ഴ��
}

class Outer_1 {
	int n = 1;
	static class Inner_1 {
		static int i = 0;
		static int j = 1;
		
		public void m() {
//			System.out.println(n); //��̬�ڲ���ֻ�ܷ������⾲̬���Ժͷ���
			System.out.println(i);
		}
	Inner_1 in = new Inner_1();
//	in.m();
	}
}