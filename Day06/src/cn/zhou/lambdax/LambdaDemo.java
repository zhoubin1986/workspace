package cn.zhou.lambdax;

public class LambdaDemo {
	public static void main(String[] args) {
//		Calc c = (x,y) -> x + y; //��������ֻ��һ��ʱLambda����ʽ��һ��д��
//		System.out.println(c.sum(1,2));
//		Calc1 c1 = (d) -> Math.sqrt(d); //ֻ��һ����������ʡ�����ţ�
										//������ֻ��һ�䣬�������������е�ĳ����̬����
										//��̬����ֱ�Ӳ�������
		Calc1 c1 = Math::sqrt;  //Lambda����ʽ����һ��д��
		System.out.println(c1.sqrt(12));
	}
}

interface Calc {
	double sum(double x,double y);
}

interface Calc1 {
	double sqrt(double d);
}