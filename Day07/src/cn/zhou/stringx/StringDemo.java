package cn.zhou.stringx;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) throws Exception {
		//��ȡ�ַ�����һ������
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = s.nextInt();
		//���ַ���ת��Ϊ�ֽ�����
		byte[] ba = str.getBytes("GBK");
		//�������ֽڸ�������У��
		if(n < 0 || n > ba.length) {
			return ;
		}
		
		//�����ֽڸ������н�ȡ
		String sub_ba = new String(ba,0,n,"GBK"); //�п������һ���ַ��ǰ���������
		//��ȡ���һ���ַ����±�
		int index = sub_ba.length() - 1; //��ȡ���һ���ַ��±�
		//�ж����һ���ַ��Ƿ�Ϊ�������
		if(sub_ba.charAt(index) != str.charAt(index)) {
			sub_ba = new String(ba,0,n-1,"gbk");
		}
		System.out.println(sub_ba);
	}
}
