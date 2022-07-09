
package cn.zhou.stringx;

public class EqualsDemo {
	public static void main(String[] args) {
		String a = new String("qqq");// new关键字是创建新的对象,不会把这个对象添加到缓冲池中,a,b分别指向不同对象,内存地址不同

		String b = new String("qqq");

		String c = "qqq";// 创建c的引用对象"qqq"时,将其放入了缓冲池中,引用指向了缓冲池中的"qqq",c,d的内存地址相同

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
		System.out.println(i.equals(l)); //基本类型不一致,false

//		System.out.println(a == b);// false
//
//		System.out.println(a == c);// false
//
//		System.out.println(c == d);// true
		
		//equals-->基本类型+引用类型  contentEquals-->引用类型
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
