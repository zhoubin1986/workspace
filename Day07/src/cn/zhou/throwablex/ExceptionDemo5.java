package cn.zhou.throwablex;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		System.out.println(m());
	}

	private static int m() {
		int i = 1;
		try {
			//������Ȼ�Ǵ�����������ִ�е�
			//��ִ��try֮ǰ�����Ƿ���finally������У���ôtry�еķ��ع����ƺ�
			//ջ�ڴ�Ľ������������+�������+�����������Ƕ����ڡ�ջ�롱��
			//��ִ��try�еĴ��룬ִ��return��䣬ֻ�ǽ��������������
			//ʵ��ִ�й��̣�try->finally->��������ʵ�ʽ��
			//i�ڼ������������������Ϊ6
			return i++;
		} finally {
			//����ִ��finally
			//i�ڼ��������������Ϊ7
			//ִ����finally�������Ὣ��������ֵ���з��ض����ն�
			//ֻ�������󲿷ֵķ���return�����һ�����ض��ѣ�������ֻ�����Ǻ������⡣�����ն˿���������Ƿ�������˳��
			//���Կ�������Ϊreturn�ǽ�ĳ��ֵ���Ϊ��������ڷ������ػ��ÿ�����
			i++;
			System.out.println("finally:" + i);
			System.out.println("finally:" + i);
		}
	}
}