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
//		StaticDemo2 a; //����->static(������), new����->���췽������ʼ�������
		new StaticDemo2();
//		new M();
//		new N();
//		new N();  //���ǵ�һ��
		P.p();  //������ջ��ռ��
//		P p = new P();
//		p.p();
//		p.p();
	}
}

class M {
	static {
		System.out.println("M1---static");
	}
	static M m = new M();  //��ֻ����һ�Σ���̬�����Ҳִֻ��һ�Σ�����static��new M();��ʼ������->��static���಻������
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
		System.out.println("P->���췽��");
	}
	public static void p() {
		System.out.println("p()");
	}
}


