package cn.zhou.throwablex;

import java.io.File;

public class ExceptionDemo1 {
	public static void main(String[] args) {
//		readTextFile(null);
		try {
//			String msg = readTextFile("D:\\a.txt");//"H:\\a.txt"
			String msg = readTextFile("e:\\a.bmp");//方法体是看不到的，只能看到花括号之前的东西throw Exception,只捕获这两个子类，很可能会漏掉抛的其他异常
			System.out.println(msg);// 如果抛出了异常对象，后续代码不在执行，所有后面不打印
		} catch (PathNotExistException | FormatErrorException e) {
			System.out.println(e.getMessage()); // 分组处理异常
//			System.out.println("捕获到了一个异常：文件路径 不存在~");
		}catch (Exception e) {
			
		}
	}

	public static String readTextFile(String path) throws Exception {
		if (path == null) {
			throw new NullPointerException("不能为空~"); // 运行时异常
		}

		// 文件路径问题
//		if(path.startsWith("D:\\")) { 
//			throw new PathNotExistException();
//		}
		if (!new File(path).exists()) {
			throw new PathNotExistException("路径错误~"); // 编译时异常
		}

		// 文件格式问题
		if (!path.endsWith(".txt")) {
			int index = path.lastIndexOf('.');
			String str_endwith = path.substring(index + 1);
			throw new FormatErrorException("需要一个txt文件，但是传入的是一个" + str_endwith + "的格式"); // 编译时异常
		}

		return "读取成功~";
	}
}
