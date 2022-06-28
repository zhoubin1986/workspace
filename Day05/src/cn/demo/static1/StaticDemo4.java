package cn.demo.static1;

public class StaticDemo4 {
	public static void main(String[] args) {
		// 先加载父类A1，再加载子类B1
		// 先创建父类对象，再创建子类对象
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