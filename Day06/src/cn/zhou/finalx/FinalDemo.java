package cn.zhou.finalx;

public class FinalDemo {
	{
		j = 5;  //���ԣ�Ҫ�ŵ�һ��λ�ã������ڶ���assigned
	}
	final int j;
	static final int k = 0; //���ܷŷǾ�̬�������棬ʱ��+�ռ�
	static final int m;
	static {
		m = 3;
	}
	public void m() {
		final int i = 1;
		//i = 0;  ������
		final int[] arr = {1,2,3};
//		arr[1] = 0; ����
//		arr = new int[3]; //�����ԣ���ַ���ɱ�
		
		
	}
	
//	public FinalDemo() {
//		this.j = 1;
//	}
}


