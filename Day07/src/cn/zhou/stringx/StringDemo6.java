package cn.zhou.stringx;

public class StringDemo6 {
	public static void main(String[] args) {
		//�ж��ַ������Ƿ������֣�
		String str = "4";
		boolean bl = str.matches(".*\\d.*");
		System.out.println(bl);
		//�ж��ַ������Ƿ�������2�����֣�
		//      .*//d{2,}.* ���ŵģ�����д�����ԣ�Ӧ��д��  .*//d.*//d.* 
		
	}
}
