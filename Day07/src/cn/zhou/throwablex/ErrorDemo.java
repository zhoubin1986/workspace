package cn.zhou.throwablex;

public class ErrorDemo {
	public static void main(String[] args) {
//		System.out.println(sum(3));
		System.out.println(sum(100000));//±¨´íStackOverflowError
	}
	
	public static int sum(int n) {
		if(1 == n) {
			return 1;
		}
		return n + sum(--n); //return n + sum(n - 1);
	}
}
