package cn.zhoubin.demo;

public class LocalCodeDemo {
	public static void main(String[] args) {
		int sum = 0;
		{  
			int i = 1;
			int j = 2;   //方法内的局部代码块，用于缩短变量i，j的生命周期，提高栈内存的利用率。
			sum = i + j;
		}
		
		System.out.println(sum);
		// 后面有1000行代码，但没有再使用到i,j变量
	}
}
