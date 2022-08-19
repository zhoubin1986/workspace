package at.zhou.collectionx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aioer");
		list.add("edf");
		list.add("oer");
		list.add("oyr");
		list.add("ofr");
		//java底层已经做了遍历和排序，只不过这里指定排序规则而已
		list.sort(new Comparator<String>() {
			//若o1>o2，将o1排在o2的后边，反之则排在前边
			@Override
			public int compare(String o1, String o2) {
				
				return o2.charAt(0) - o1.charAt(0); //降序排列，制定的规则，相等则原来list集合中的顺序不变
			}
		});
		System.out.println(list);
	}
}
