package at.zhou.collectionx;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		//List是Collection的子接口，因此部分方法是可以直接用的
		List<String> li = new ArrayList<>();
		li.add("d");
		li.add("a");
		li.add("t");
		li.add("e");
		li.add("e");
		//允许存储重复的元素
		System.out.println(li);
		
		String str = li.get(0);
		System.out.println(str);
	}
}
