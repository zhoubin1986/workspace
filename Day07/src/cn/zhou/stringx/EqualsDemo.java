
package cn.zhou.stringx;

public class EqualsDemo {
	public static void main(String[] args) {
		String a = new String("qqq");// new�ؼ����Ǵ����µĶ���,��������������ӵ��������,a,b�ֱ�ָ��ͬ����,�ڴ��ַ��ͬ

		String b = new String("qqq");

		String c = "qqq";// ����c�����ö���"qqq"ʱ,��������˻������,����ָ���˻�����е�"qqq",c,d���ڴ��ַ��ͬ

		String d = "qqq";

		StringBuffer e = new StringBuffer("qqq");
		
		
		char[] in1 = {'q','a'};
		char[] in2 = {'q','a'};
		System.out.println(in1.equals(in2));
		Integer i = 5;
		Integer j = 10;
		Integer k = 5;
		Short l = 5;
		System.out.println(i.equals(j)); //false
		System.out.println(i.equals(k)); //true
		System.out.println(i.equals(l)); //�������Ͳ�һ��,false

//		System.out.println(a == b);// false
//
//		System.out.println(a == c);// false
//
//		System.out.println(c == d);// true
		
		//equals-->��������+��������  contentEquals-->��������
		System.out.println(a.equals(b));// true

		System.out.println(a.equals(c));// true

		System.out.println(c.equals(d));// true

		System.out.println(a.equals(e));// false

		System.out.println(a.contentEquals(b));// true

		System.out.println(a.contentEquals(c));// true

		System.out.println(c.contentEquals(d));// true

		System.out.println(a.contentEquals(e));// true
	}
}
