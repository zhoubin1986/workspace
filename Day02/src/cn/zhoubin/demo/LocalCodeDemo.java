package cn.zhoubin.demo;

public class LocalCodeDemo {
	public static void main(String[] args) {
		int sum = 0;
		{  
			int i = 1;
			int j = 2;   //�����ڵľֲ�����飬�������̱���i��j���������ڣ����ջ�ڴ�������ʡ�
			sum = i + j;
		}
		
		System.out.println(sum);
		// ������1000�д��룬��û����ʹ�õ�i,j����
	}
}
