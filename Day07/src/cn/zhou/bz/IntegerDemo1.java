package cn.zhou.bz;

public class IntegerDemo1 {
	public static void main(String[] args) {
//		Integer in = new Integer("0x256");
//		System.out.println(in); //NumberFormatException����
		//�ײ���������λ�ж�
		//1.���жϵ�һλ�Ƿ������֣�����������Ƿ���+/-
		//2.����Ϊ�����ж�ÿһλ�Ƿ�������
		int i = Integer.parseInt("-128");
		System.out.println(i);
		
		//3.14
		double d = Double.parseDouble("3.14");
		System.out.println(d);
		
		byte b = Byte.parseByte("3");
		System.out.println(b);
		
		//"a" --->'a'
//		char c = "a".charAt(0);
//		char c = Character.parseChar(); û�����ַ���
//		System.out.println(c);
		char c = "a".toCharArray()[0];
		System.out.println(c);
		
		//ֻ�в���true������һ�ɶ���false
		boolean bl = Boolean.parseBoolean("true");
		System.out.println(bl);
		boolean bl_1 = Boolean.parseBoolean(null);
		System.out.println(bl_1);
		boolean bl_2 = Boolean.parseBoolean("abc");
		System.out.println(bl_2);
		
		//hashCode(),��װ������Ķ���ֻҪʵ��ֵһ������ô��ϣ���һ��
		System.out.println(new Integer(256).hashCode());//����OS/����hash�벻��
		//����Ĭ��Ϊint����ҪǿתΪbyte�����췽��������byte����public Byte(byte value) {this.value = value;}
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
		System.out.println(Double.NaN == Double.NaN); //�Ƚ�����ط��������Լ����Լ�����һ����Ψ��NaN����
		//NaN��Ե���С�����ж��Ƿ���NaN
		System.out.println(Double.isNaN(0.0/0));
		System.out.println(Float.isNaN((float)0.0/0));
		
	}
}