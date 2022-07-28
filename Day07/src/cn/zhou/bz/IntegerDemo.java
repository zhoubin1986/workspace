package cn.zhou.bz;

public class IntegerDemo {
	public static void main(String[] args) {
//		int i = 1;
//		Integer in = new Integer(i); 
//		System.out.println(in);//底层肯定调用了toString方法,in是个地址
		int i = 2;
		Integer in = i;//将基本类型变量直接赋值给引用类型对象的过程
		
		//自动封箱或者自动装箱过程,会调用这个类身上的valueOf方法
		//等价于Integer in = Integer.valueOf(i);
		double j = 2.2;
		Double d = j;
		
		char c = 'a';
		Character ch = c;
	}
}
