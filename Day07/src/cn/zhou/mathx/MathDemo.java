package cn.zhou.mathx;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.E);//E-->��Ȼ���������޲�ѭ����С��
		System.out.println(Math.abs(-10));
		System.out.println(Math.cbrt(-27));
		System.out.println(Math.ceil(5.2)); //����ȡ��
		System.out.println(Math.floor(5.2));//����ȡ��
		System.out.println(Math.round(5.2));//��������
		System.out.println(Math.pow(3, 4)); //��
		
		System.out.println(Math.random());//����[0,1)֮��������
		//��ȡ30-80֮����������
		System.out.println((int)(Math.random() * 50 + 30));
		
		//System.out.println(1 + "2");
		//���������֤��
//		String result = "";
//		for(int i=0;i<6;i++) {
//			int j = (int)(Math.random() * 10);
//			result += j;
//		}
//		System.out.println(result);
		//���ɴ���ĸ��֤��
		String result = "";
		char[] ca = {'a','b','c','d','e','f','A','B','C'}; //26+26+10=62
		for(int i=0;i<6;i++) {
			int index = (int)(Math.random() * 9);
			result += ca[index];
		}
		System.out.println(result);
	}
}