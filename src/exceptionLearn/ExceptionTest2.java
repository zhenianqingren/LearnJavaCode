package exceptionLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 
 *异常处理方式2 throws+异常类型 
 * 
 * 
 * throws+异常类型写在方法的声明处，指明此方法执行时可能出现的异常 一旦方法体执行出现异常 会在异常代码处生成异常对象 满足throws类型后
 * 就会被抛出 异常后的代码不会被执行
 * 
 * try-catch-finally真正解决了异常
 * 而throws只是将异常抛出
 * 
 * 
 * 
 * 
 * 
 * */
public class ExceptionTest2 {

	public static void method2() throws IOException {
		method1();
		System.out.println("Deal With FileException");
	}

	public static void method1() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		File file = new File("hello.txt");
		fis = new FileInputStream(file);

		int data;
		while ((data = fis.read()) != -1)
			System.out.println((char) data);

		fis.close();
	}

	public static void main(String[] args) {
		try {
			method2();
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}

}
