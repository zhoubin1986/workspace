package at.zhou.collectionx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		// List��Collection���ӽӿڣ���˲��ַ����ǿ���ֱ���õ�
		List<String> li = new ArrayList<>();
		li.add("d");
		li.add("a");
		li.add("t");
		li.add("e");
		li.add("e");

		List<String> li2 = new ArrayList<>();
		li2.add(new String("d"));
		li2.add(new String("a"));
		li2.add(new String("t"));
		li2.add(new String("e"));
		li2.add(new String("e"));
//		li2.add(2, "m");
		// �����洢�ظ���Ԫ��
		System.out.println(li.equals(li2));// �ڵײ������Ԫ�ؽ���equals
		System.out.println(li);

		String str = li.get(0);
		System.out.println(str);

		// ��Object[]���Ƕ�����һ��һά�Ķ������Object���κζ���ĸ��࣬Ҳ����˵����ת�����κε����͡�������
		Object[] object = new Object[3];
		object[0] = new String("12312");
		object[1] = new String[] { "String1", "String2" };
		object[2] = new Date();
	}
}