package cn.zhou.finalx;

public class FinalDemo {
	{
		j = 5;  //可以，要放第一行位置，否则会第二次assigned
	}
	final int j;
	static final int k = 0; //不能放非静态方法里面，时间+空间
	static final int m;
	static {
		m = 3;
	}
	public void m() {
		final int i = 1;
		//i = 0;  不可以
		final int[] arr = {1,2,3};
//		arr[1] = 0; 可以
//		arr = new int[3]; //不可以，地址不可变
		
		
	}
	
//	public FinalDemo() {
//		this.j = 1;
//	}
}


