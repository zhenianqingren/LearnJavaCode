package exceptionLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * finally的使用
 * 
 * finally中的语句一定会执行 即使catch中又出现异常 或者catch中存在return 或者try中存在return
 * 
 * 
 * 像数据库连接、输入输出流、网络编程Socket等资源，JVM不能自动回收，需要手动进行资源的释放，此时资源的释放就需要声明在finally中
 * 
 * 该结构可以嵌套
 * **/
public class FinallyTest {
	public static void test2()
	{
		FileInputStream fis=null;
		try {
			File file=new File("hello.txt");
			fis=new FileInputStream(file);//右键 Surround with
			
			int data;
			while((data=fis.read())!=-1)
				System.out.println((char)data);
			
		} catch (FileNotFoundException e) {
			System.out.println("No This File");
		}
		catch (IOException e) {
			System.out.println("IO Exception");
		}
		finally {
			try {
				fis.close();
			} catch (Exception e2) {
				System.out.println("Exception");
			}
			
		}
	}
	public static void main(String[] args) {
		
		try {
			test2();
			System.out.println(5/0);
		}catch (ArithmeticException e) {
			System.out.println("Math Exception");
			return;
		}catch (Exception e) {
			System.out.println("Exception occur");
		}finally {
			System.out.println("This is Finally");
			return;//此处才是程序结束的地方
		}
//		System.out.println("Hello World");
	}
}
