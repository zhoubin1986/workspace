package cn.zhou.throwablex;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		System.out.println(m());
	}

	private static int m() {
		try {
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			return 2;
			//��ӡջ�켣
			e.printStackTrace();
		}
//		return 2;
		finally {
//			return 2;
			try {
				return 2;
			} finally  {
				return 3;
			}
//			return 4;
		}
	}
}
