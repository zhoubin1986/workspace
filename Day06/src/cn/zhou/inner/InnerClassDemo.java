package cn.zhou.inner;

public class InnerClassDemo {
	public static void main(String[] args) {
		System.out.println();
	}
}

class Outer {
	final int i = 1;
	static int j = 2;

	// int k = 10; //�����޸���������
	public void m1() {
		// int k = 3;
		class Inner1 extends Object implements Cloneable {
			int x = 0; // �Ǿ�̬����
			static final int y = 1; // ��̬����

			public void m() { // �Ǿ�̬����
				// k = 4; //�����ڲ�����ʹ�þֲ�������Ĭ��Ϊ�����������޸�
				System.out.println(i);
				System.out.println(j);
			}
		}
		Inner1 in1 = new Inner1();
	}

	public void m2() {
		class Inner2 { // �����ڲ������ڶ��巽��
			public void m() { // ���øö��д��룬��ֻ���ڸ÷�����ʹ��
				// 10�д���
			}
		}

		Inner2 in2 = new Inner2();
		in2.m();
		// ��������
		in2.m();
	}

	public void m() {

	}
}