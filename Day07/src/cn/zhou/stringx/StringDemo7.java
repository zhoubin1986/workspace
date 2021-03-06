package cn.zhou.stringx;

public class StringDemo7 {
	public static void main(String[] args) {
		String str = "aabb";
		//判断字符串中是否含有"ab"
		str.contains("ab");
		str.matches(".*ab.*");
		//表示引用编号为1的捕获组
//		System.out.println(str.matches(".*(abcdef).*\\1.*"));
		//(A(BC(D)E)F)(G) -->捕获组从左往右出现(位置开始计算，先出现，编号靠前
		//  \\1  A(BC(D)E)F 
		//  \\2  BC(D)E
		//  \\3  D
		//  \\4  G
		
		//判断字符串是否叠字
		//(.){2,}     表示至少有两个字符,这种也不行(.)\\1{2,}
		//(.)\\1+        匹配叠字
		System.out.println(str.matches("(.){2,}"));
		System.out.println(str.matches("(.)\\1{1,}")); //可以
		System.out.println(str.matches("(.)\\1+"));
		
		//AABB
		System.out.println(str.matches("(.)\\1(.)\\2"));
		//ABAB
		System.out.println(str.matches("(..)\\1"));
	}
}
