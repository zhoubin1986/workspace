package cn.zhou.stringx;

public class RegExReplace {
	public static void main(String[] args) {
		String str = "ab?cdefghij345";
		//将字符串中的数字替换为-
		System.out.println(str.replace("ab", "++"));
		System.out.println(str.replaceAll("\\d", "-"));
		//将字符串中的所有数字去掉
		System.out.println(str.replaceAll("\\d", ""));
		System.out.println(str.replaceAll("\\D", ""));
		
		String sub = str.replaceAll("\\D", ""); //可能还有特殊符号
		char[] ch = sub.toCharArray();
		int num = 0;
		for(char c:ch) {
			num += c - '0';
		}
		System.out.println(num);
	}
}
