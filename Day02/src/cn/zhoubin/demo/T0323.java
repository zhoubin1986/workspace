package cn.zhoubin.demo;

public class T0323 {
	public static void main(String[] args) {
		int num = -11;
		int count = 0;
		for(int i=0;i<32;i++){
			if((num & 1) == 1){
				count++;
			}
			num >>= 1;
		}
		System.out.println(count);
	}
}
