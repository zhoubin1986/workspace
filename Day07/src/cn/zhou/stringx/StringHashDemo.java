package cn.zhou.stringx;

public class StringHashDemo {
	public static void main(String[] args) {
		String str1 = "eabcdefghhhbce";  //�ַ�����hash���ǹ̶���
//		System.out.println(str.hashCode());
//		int index = str.indexOf('b', 1);
//		int index = str.indexOf("bc");
//		System.out.println(index);
		subString(str1, "bc");
		
		
	}
	//����һ���ַ�����һ�����ַ�����������λ�õ�index
			//Ū��һ������
	public static void subString(String str,String sub) {
		//������������
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
