package cn.zhou.inner;

public class AnonymousInnerClassDemo {
	Calc c = new Calc() { // ���������ڲ��ഴ������
		@Override
		public double sum(double i, double j) {
			return i + j;
		}
	};

	A a = new A() {
	};
	B b = new B() { //ʵ���������ڲ�����B��һ�����࣬������static����
	};
}

interface Calc {
	double sum(double i, double j);
}

// class Calc_imp implements Calc {
// @Override
// public double sum(double i, double j) {
// return 0;
// }
// }

interface A {
}

class B {   //��static �ж�
}