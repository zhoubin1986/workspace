package cn.zhou.bz;

public class IntegerDemo1 {
	public static void main(String[] args) {
//		Integer in = new Integer("0x256");
//		System.out.println(in); //NumberFormatException报错
		//底层做的是逐位判断
		//1.先判断第一位是否是数字，如果不是则看是否是+/-
		//2.其余为依次判断每一位是否是数字
		int i = Integer.parseInt("-128");
		System.out.println(i);
		
		//3.14
		double d = Double.parseDouble("3.14");
		System.out.println(d);
		
		byte b = Byte.parseByte("3");
		System.out.println(b);
		
		//"a" --->'a'
//		char c = "a".charAt(0);
//		char c = Character.parseChar(); 没有这种方法
//		System.out.println(c);
		char c = "a".toCharArray()[0];
		System.out.println(c);
		
		//只有不填true，其他一律都是false
		boolean bl = Boolean.parseBoolean("true");
		System.out.println(bl);
		boolean bl_1 = Boolean.parseBoolean(null);
		System.out.println(bl_1);
		boolean bl_2 = Boolean.parseBoolean("abc");
		System.out.println(bl_2);
		
		//hashCode(),包装类产生的对象，只要实际值一样，那么哈希码就一致
		System.out.println(new Integer(256).hashCode());//换了OS/环境hash码不变
		//整数默认为int，需要强转为byte，构造方法里面是byte类型public Byte(byte value) {this.value = value;}
		System.out.println(new Byte((byte) 82).hashCode()); 
		System.out.println(new Long(5201811986L).hashCode()); 
		System.out.println(new Float(5.02f).hashCode()); 
		System.out.println(new Double(5.02).hashCode()); 
		System.out.println(new Character('a').hashCode()); 
		System.out.println(new Boolean(true).hashCode()); 
		
		System.out.println(Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY);
		System.out.println(-1.0/0);
		System.out.println(1.0/0);
		System.out.println(0.0/0);
		System.out.println(0/0.0);
		System.out.println(Double.NaN == Double.NaN); //比较特殊地方，其他自己比自己都是一样，唯独NaN例外
		//NaN针对的是小数，判断是否是NaN
		System.out.println(Double.isNaN(0.0/0));
		System.out.println(Float.isNaN((float)0.0/0));
		
	}
}
