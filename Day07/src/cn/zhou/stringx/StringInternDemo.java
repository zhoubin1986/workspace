package cn.zhou.stringx;

public class StringInternDemo {
	public static void main(String[] args) {
		//�����ַ�����ʽ
		String str1 = "abc"; //ָ������
		String str2 = new String("abc"); //ָ�������ָ������
		System.out.println(str1 == str2);
//		System.out.println(str1 == str2.intern());
		System.out.println(str1.equals(str2));
		
		//String str = "";���ַ��� ������Ϊ�㣬�г����ص�ַ�� String str = null; �ַ���Ϊ�գ�ռ��û�е�ַ�������ڸö���
//		String str = null;
		String str = "";
		System.out.println(str.isEmpty());
		System.out.println(str1.replace('a', '+'));
		System.out.println(str1.toString()); //�滻��ƴ�ӵȶ����ñ�ԭ�ַ���
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		String str3 = new String(" tyu\t\n\r\f"); //\f��ҳ�� ����ͷȥβ�����ϴ��ֻ�
		System.out.println(str3);
		System.out.println(str3.trim());
		
		//�ַ���ƴ��
		char[] ch = {'1','a','3'};
		String str4 = new String(ch);
		System.out.println(ch);
		
		
	}
}