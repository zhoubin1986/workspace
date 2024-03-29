package cn.zhou.throwablex;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		System.out.println(m());
	}

	private static int m() {
		int i = 1;
		try {
			//代码依然是从上往下依次执行的
			//在执行try之前会检测是否有finally，如果有，那么try中的返回过程推后
			//栈内存的结果：计算区域+结果区域+变量表（它们都属于“栈针”）
			//先执行try中的代码，执行return语句，只是将结果放入结果区域
			//实际执行过程：try->finally->方法返回实际结果
			//i在计算区域继续运算自增为6
			return i++;
		} finally {
			//继续执行finally
			//i在计算区域继续自增为7
			//执行完finally，方法会将结果区域的值进行返回丢给终端
			//只不过绝大部分的方法return是最后一步返回而已，在这里只不过是后延问题。所以终端看到的情况是反过来的顺序！
			//所以可以理解为return是将某个值标记为结果，至于返不返回还得看后面
			i++;
			System.out.println("finally:" + i);
			System.out.println("finally:" + i);
		}
	}
}
