package cn.zhou.stringx;

public class RegExSplit {
	public static void main(String[] args) {
		String str = "23a245bcd3ef4g";
		//�����ڿ�ͷ�����м䣨�����г����ַ�������β�͡������ֿ�ͷ��β��(ȫ���е�)���
		String[] arr = str.split("\\d");
		System.out.println(arr.length);
		for(String s:arr) {
			System.out.println(s);
		}
	}
}