package cn.demo.static1;

public class StaticDemo6 {
	public static void main(String[] args) {
		Farther f = new Son();   //��������
		f.m();  /*��Ȼfָ�����һ��������󣬵�����Ȼ���õ��Ǹ�����෽����
			        ������fָ��һ���ն���null��ʱ��Ҳ�ܹ��ɹ�����m().
			        ���Ժ�fָ���ĸ������޹أ�ֻ��f�������й�ϵ��
			        ��Ȼ��Ҳ������ͨ������ȥ�����෽������Ӧ��ֱ��ͨ����ȥ�����෽�����Ӷ��������ϵ����塣 */
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
