package cn.zhou.stringx;

public class RegExReplace {
	public static void main(String[] args) {
		String str = "ab?cdefghij345";
		//���ַ����е������滻Ϊ-
		System.out.println(str.replace("ab", "++"));
		System.out.println(str.replaceAll("\\d", "-"));
		//���ַ����е���������ȥ��
		System.out.println(str.replaceAll("\\d", ""));
		System.out.println(str.replaceAll("\\D", ""));
		
		String sub = str.replaceAll("\\D", ""); //���ܻ����������
		char[] ch = sub.toCharArray();
		int num = 0;
		for(char c:ch) {
			num += c - '0';
		}
		System.out.println(num);
	}
}
