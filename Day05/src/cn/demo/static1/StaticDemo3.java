package cn.demo.static1;

public class StaticDemo3 {
	public static void main(String[] args) {
		//�ȼ��ظ���A1���ټ�������B1
		//�ȴ�����������ٴ����������
		new B1();
	}
}

class A1 {
	C1 c = new C1();
	static {
		System.out.println("A1");
	}
	{
		System.out.println("A2");
	}

	public A1() {
		System.out.println("A3");
	}
}

class B1 extends A1 {
	static C1 c = new C1();
	static {
		System.out.println("B1");
	}
	{
		System.out.println("B2");
	}

	public B1() {
		super();
		System.out.println("B3");  
	}
}

class C1 {
	static {
		System.out.println("C1");
	}
	public C1() {
		System.out.println("C2");
	}
}