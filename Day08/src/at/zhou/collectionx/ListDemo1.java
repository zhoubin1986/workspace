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
		//java�ײ��Ѿ����˱���������ֻ��������ָ������������
		list.sort(new Comparator<String>() {
			//��o1>o2����o1����o2�ĺ�ߣ���֮������ǰ��
			@Override
			public int compare(String o1, String o2) {
				
				return o2.charAt(0) - o1.charAt(0); //�������У��ƶ��Ĺ��������ԭ��list�����е�˳�򲻱�
			}
		});
		System.out.println(list);
	}
}