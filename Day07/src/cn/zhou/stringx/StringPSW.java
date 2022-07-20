package cn.zhou.stringx;

import java.util.Scanner;

public class StringPSW {
	public static void main(String[] args) {
		//����һ����8~12λ�ַ���ɵ����룬�ɴ�д��ĸ��Сд��ĸ�����ֻ�ո�������2�����
		//8~12λ,����ƥ��
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean bl = checkPSW(str);
		System.out.println(bl);
	}
	
	public static boolean checkPSW(String psw){
		if(!psw.matches("[a-zA-Z0-9 ]{8,12}")) //"[][][]"
			return false;
		int n = 0;
		//�ж��Ƿ���Сд��ĸ
		if(psw.matches(".*[a-z].*"))
			n++;
		//�ж��Ƿ��д�д��ĸ
		if(psw.matches(".*[A-Z].*"))
			n++;
		//�ж��Ƿ�������
		if(psw.matches(".*[0-9].*"))
			n++;
		//�ж��Ƿ��пո�
		if(psw.matches(".* .*"))
			n++;
		return n>=2;
		
	}
}