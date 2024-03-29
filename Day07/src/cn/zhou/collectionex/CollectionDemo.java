package cn.zhou.collectionex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		// 添加数据
		c.add("h99");
		c.add("e");
		c.add("l");
		c.add("l");
		c.add("o");
		
	

		/*
		 * //移出数据 c.remove("h"); System.out.println(c.contains("a"));
		 * System.out.println(c); //把集合转化为数组 //Object[] o = c.toArray(); // String[] arr
		 * = (String[])c.toArray(); //不能这样转换 //得告诉当前集合要转化的是一个String[] String[] str =
		 * c.toArray(new
		 * String[0]);//给0和其他值效果是一样的，执行情况不一样，给0的话不用找空间，只需要告诉当前集合传入的是String[]类型 //
		 * Integer[] str = c.toArray(new Integer[0]);
		 * 
		 * // for(Object o:arr) { //// System.out.println(((String)o).charAt(0)); //
		 * System.out.println(); // } for(String s:str) { System.out.print(s); //字符串类型
		 * // System.out.println(str); //字符串数组类型 }
		 */

		// 方式一：遍历集合，集合没有下标如何遍历
		// 方法一：增强for循环
		for (String str : c) {
			System.out.println(str);
		}
		// 方式二：forEach方法 --->JDK1.8出现的
		c.forEach(new Consumer<String>() { // Consumer也是一个接口

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		// TODO Lambda表达式书写 //Eclipse提供的一种标记形式，标记为未完成的任务，windows-->show view-->tasks
//		c.forEach(System.out::println); //和上面形式一样
//		c.forEach(str -> System.out.println(str));

	}
}
