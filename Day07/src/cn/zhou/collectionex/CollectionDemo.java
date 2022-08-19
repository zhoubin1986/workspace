package cn.zhou.collectionex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		// ��������
		c.add("h99");
		c.add("e");
		c.add("l");
		c.add("l");
		c.add("o");
		
	

		/*
		 * //�Ƴ����� c.remove("h"); System.out.println(c.contains("a"));
		 * System.out.println(c); //�Ѽ���ת��Ϊ���� //Object[] o = c.toArray(); // String[] arr
		 * = (String[])c.toArray(); //��������ת�� //�ø��ߵ�ǰ����Ҫת������һ��String[] String[] str =
		 * c.toArray(new
		 * String[0]);//��0������ֵЧ����һ���ģ�ִ�������һ������0�Ļ������ҿռ䣬ֻ��Ҫ���ߵ�ǰ���ϴ������String[]���� //
		 * Integer[] str = c.toArray(new Integer[0]);
		 * 
		 * // for(Object o:arr) { //// System.out.println(((String)o).charAt(0)); //
		 * System.out.println(); // } for(String s:str) { System.out.print(s); //�ַ�������
		 * // System.out.println(str); //�ַ����������� }
		 */

		// ��ʽһ���������ϣ�����û���±���α���
		// ����һ����ǿforѭ��
		for (String str : c) {
			System.out.println(str);
		}
		// ��ʽ����forEach���� --->JDK1.8���ֵ�
		c.forEach(new Consumer<String>() { // ConsumerҲ��һ���ӿ�

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		// TODO Lambda����ʽ��д //Eclipse�ṩ��һ�ֱ����ʽ�����Ϊδ��ɵ�����windows-->show view-->tasks
//		c.forEach(System.out::println); //��������ʽһ��
//		c.forEach(str -> System.out.println(str));

	}
}