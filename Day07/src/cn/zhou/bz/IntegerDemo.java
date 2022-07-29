package cn.zhou.bz;

public class IntegerDemo {
	public static void main(String[] args) {
//		int i = 1;
//		Integer in = new Integer(i); 
//		System.out.println(in);//底层肯定调用了toString方法,in是个地址
		int i = 2;
		Integer in = i;//将基本类型变量直接赋值给引用类型对象的过程
		
		//自动封箱或者自动装箱过程,会调用这个类身上的valueOf方法
		//等价于Integer in = Integer.valueOf(i); 验证结果是它
		//Integer in = new Integer(i);
		/**
		 *i=26时比较结果为true
		 *i=526时比较结构为false
		 *int i = 526;
		 *Integer i1 = i; -->cache[26 + 128]
		 *Integer i2 = i; -->cache[26 + 128]
		 *利用==比较的是地址
		 *System.out.println(i1 == i2);
		 *j = 127;
		 *cache[0] = new Integer(-128);
		 *cache[1] = new Integer(-127);
		 *cache[2] = new Integer(-126);
		 *...
		 *cache[255] = new Integer(127);
		 *
		 *valueOf[-126 + 128] -->cache[2]
		 *valueOf[3 + 128]
		 */
		double j = 2.2;
		Double d = j;
		
		char c = 'a';
		Character ch = c;
	}
}
