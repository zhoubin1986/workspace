package cn.zhou.stringx;

public class StringDemo7 {
	public static void main(String[] args) {
		String str = "aabb";
		//�ж��ַ������Ƿ���"ab"
		str.contains("ab");
		str.matches(".*ab.*");
		//��ʾ���ñ��Ϊ1�Ĳ�����
//		System.out.println(str.matches(".*(abcdef).*\\1.*"));
		//(A(BC(D)E)F)(G) -->������������ҳ���(λ�ÿ�ʼ���㣬�ȳ��֣���ſ�ǰ
		//  \\1  A(BC(D)E)F 
		//  \\2  BC(D)E
		//  \\3  D
		//  \\4  G
		
		//�ж��ַ����Ƿ����
		//(.){2,}     ��ʾ�����������ַ�,����Ҳ����(.)\\1{2,}
		//(.)\\1+        ƥ�����
		System.out.println(str.matches("(.){2,}"));
		System.out.println(str.matches("(.)\\1{1,}")); //����
		System.out.println(str.matches("(.)\\1+"));
		
		//AABB
		System.out.println(str.matches("(.)\\1(.)\\2"));
		//ABAB
		System.out.println(str.matches("(..)\\1"));
	}
}