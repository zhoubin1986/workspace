package cn.demo.static1;

public class StaticDemo4 {
	public static void main(String[] args) {
		// �ȼ��ظ���A1���ټ�������B1
		// �ȴ�����������ٴ����������
		new BB();
	}
}

class AA {
	CC c = new CC();
	static {
		System.out.println("AA1");
	}
	{
		System.out.println("AA2");
	}

	public AA() {
		System.out.println("AA3");
	}
}

class BB extends AA {
	static DD d = new DD();
	static {
		System.out.println("BB1");
	}
	{
		System.out.println("BB2");
	}

	public BB() {
		super();
		System.out.println("BB3");
	}
}

class CC {
	static {
		System.out.println("CC1");
	}

	public CC() {
		System.out.println("CC2");
	}
}

class DD extends CC {
	static {
		System.out.println("DD1");
	}

	public DD() {
		System.out.println("DD2");
	}
}