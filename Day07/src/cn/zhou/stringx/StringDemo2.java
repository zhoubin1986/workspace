package cn.zhou.stringx;

import java.util.Scanner;

public class StringDemo2 {
	@SuppressWarnings("resource") //ѹ�ƾ���
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		int letter = 0;
		int number = 0;
		int symbol = 0;
		
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
				letter++;
			}else if(c >= '0' && c <= '9'){
				number++;
			}else{
				symbol++;
			}
		}
		
		System.out.println("��ĸ��" + letter);
		System.out.println("���֣�" + number);
		System.out.println("���ţ�" + symbol);
	}
}
