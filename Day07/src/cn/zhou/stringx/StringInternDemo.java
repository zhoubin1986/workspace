package cn.zhou.stringx;

public class StringInternDemo {
	public static void main(String[] args) {
		//定义字符串形式
		String str1 = "abc"; //指向常量池
		String str2 = new String("abc"); //指向堆区再指向常量池
		System.out.println(str1 == str2);
//		System.out.println(str1 == str2.intern());
		System.out.println(str1.equals(str2));
		
		//String str = "";空字符串 ，长度为零，有常量池地址。 String str = null; 字符串为空，占名没有地址，不存在该对象。
//		String str = null;
		String str = "";
		System.out.println(str.isEmpty());
		System.out.println(str1.replace('a', '+'));
		System.out.println(str1.toString()); //替换、拼接等都不该变原字符串
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		String str3 = new String(" tyu\t\n\r\f"); //\f分页符 ，掐头去尾，古老打字机
		System.out.println(str3);
		System.out.println(str3.trim());
		
		//字符串拼接比较特殊的是字符数组，打印的是拼接后的字符串
		char[] ch = {'1','a','3'};
		int[] in = {'3','4','5'};
		String str4 = new String(ch);
//		String str5 = new String(ch,1,2);
		String str5 = String.valueOf(ch);
		System.out.println(ch);
		System.out.println(str5);
		System.out.println(in);
		
		//判断一个字符串是否有一个字母组成
		String str6 = "111";
		System.out.println(str6.matches("[a-zA-Z]"));
		//判断一个字符串是否由非字母组成
//		System.out.println(!str6.matches("[a-zA-Z]"));
		System.out.println(str6.matches("[^a-zA-Z]"));
	}
}
