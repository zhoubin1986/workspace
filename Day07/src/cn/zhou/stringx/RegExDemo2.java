package cn.zhou.stringx;

public class RegExDemo2 {
	public static void main(String[] args) {
		String str = "abcde";
		//��5����ĸ���
		System.out.println(str.matches("[a-zA-Z]{4}"));
		//������5����ĸ���
//		System.out.println(str.matches("[a-zA-Z]{4}[a-zA-Z]+"));
		System.out.println(str.matches("[a-zA-Z]{5,}"));
		//������6-12���ַ����
		System.out.println(str.matches(".{6,12}"));
	}
}