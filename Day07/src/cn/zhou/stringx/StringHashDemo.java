package cn.zhou.stringx;

public class StringHashDemo {
	public static void main(String[] args) {
		String str1 = "eabcdefghhhbce";  //字符串的hash码是固定的
//		System.out.println(str.hashCode());
//		int index = str.indexOf('b', 1);
//		int index = str.indexOf("bc");
//		System.out.println(index);
		subString(str1, "bc");
		
		
	}
	//输入一个字符串及一个子字符串，找所有位置的index
			//弄成一个方法
	public static void subString(String str,String sub) {
		//不定次数查找
		int index = 0;
		while(index < str.length()) {
			index = str.indexOf(sub, index);
			if(index != -1) {
				System.out.println(index);
				index++;
			}else{
				break;
			}
		}
	}
}
