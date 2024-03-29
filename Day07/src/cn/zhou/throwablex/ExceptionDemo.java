package cn.zhou.throwablex;

import java.io.File;
import java.text.Format;

public class ExceptionDemo {
	public static void main(String[] args) {
		// 去读取一个文件，模拟异常处理，要么向上抛出，要么捕获
//		String msg = readTextFile("D:\\a.bmp");  //编译时异常
		/*
		 * try { // String msg = readTextFile("D:\\a.txt");//"H:\\a.txt" String msg =
		 * readTextFile("e:\\a.bmp"); System.out.println(msg);//
		 * 如果抛出了异常对象，后续代码不在执行，所有后面不打印 } catch (PathNotExistException e) {
		 * System.out.println(e.getMessage()); //
		 * System.out.println("捕获到了一个异常：文件路径 不存在~"); } catch (FormatErrorException e) {
		 * // System.out.println("文件格式不正确"); System.out.println(e.getMessage()); }
		 * }catch(Exception e){ System.out.println(e.getMessage()); //向上造型，抛子类异常，用父类异常捕获
		 * }
		 */

		try {
//				String msg = readTextFile("D:\\a.txt");//"H:\\a.txt"
			String msg = readTextFile("e:\\a.bmp");
			System.out.println(msg);// 如果抛出了异常对象，后续代码不在执行，所有后面不打印
		} catch (PathNotExistException | FormatErrorException e) {
			System.out.println(e.getMessage());  //分组处理异常
//				System.out.println("捕获到了一个异常：文件路径 不存在~");
		} 
	}

	public static String readTextFile(String path) throws PathNotExistException, FormatErrorException {
		// 文件路径问题
//		if(path.startsWith("D:\\")) { 
//			throw new PathNotExistException();
//		}
		if (!new File(path).exists()) {
			throw new PathNotExistException("路径错误~");
		}

		// 文件格式问题
		if (!path.endsWith(".txt")) {
			int index = path.lastIndexOf('.');
			String str_endwith = path.substring(index + 1);
			throw new FormatErrorException("需要一个txt文件，但是传入的是一个" + str_endwith + "的格式");
		}

		return "读取成功~";
	}
}

class PathNotExistException extends Exception {
//	private String message;
	public PathNotExistException(String msg) {
		super(msg); // 已经写好的
	}
//	public String getMessage() {
//		return message;
//	}
}

class FormatErrorException extends Exception {
	private String message;

	public FormatErrorException(String msg) {
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}
}
