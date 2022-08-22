package at.zhou.collectionx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();//引用类型中的字符串类型
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
		
		//扩容过程
		/*private void grow(int minCapacity) {
	        int oldCapacity = elementData.length;
	        int newCapacity = oldCapacity + (oldCapacity >> 1);
	        if (newCapacity - minCapacity < 0)
	            newCapacity = minCapacity;
	        if (newCapacity - MAX_ARRAY_SIZE > 0)
	            newCapacity = hugeCapacity(minCapacity);
	        elementData = Arrays.copyOf(elementData, newCapacity);
	    }*/
	}
}
