package Revise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;


//

//字节流InputStream OutPutStream
//字符流Reader Writer
//文件流FileInputStream FileOutPutStream
//过滤流FilterInputStream FilterOutPutStream
//基本流System.in System.out
//
//对于字符串:   j a v a 语 言
//用字符流读取需要读6次，因为是6个字符 用字节流读取需要读8次，因为是8个字节（汉字占2个字节）
//
//InputStream OutPutStream Reader Writer是4个基本的输入输出类（抽象类）
//InputStream和OutPutStream是所有字节流输入输出类的父类
//Reader和Writer是所有字符输入输出流的父类
//
//InputStream类基本方法
//public abstract int read()返回读到的数据
//public int read(byte b[])返回实际的字节数
//public int read(byte b[],int offset,int len)
//OutPutStream类基本方法
//public abstract write(int b)写入整形第一个字节
//public void write(byte b[])写入数组b中所有字节
//public void write(byte b[],int offset,int len)
//
//装饰模式中的角色:
//Component:抽象构件类
//ConcreteComponent:具体构件类
//Decorator:抽象装饰类
//ConcreteDecorator:具体装饰类
//
//Reader常用子类:
//BufferedReader:从字符输入流中读取文本,缓冲各个字符,从而实现字符、数组和行的高效读取,可以指定缓冲区的大小
//InputStreamReader:字节流转换为字符流,使用指定的charset将读入的字节转换为字符,read()会读一个或多个字节
//FileReader:用来读取字符文件的类
//
//Writer常用子类:
//BufferedWriter:将文本写入字符输出流,缓冲各个字符,可以指定缓冲区的大小,可以直接写String类型
//OutPutWriter:字符流按照指定charset转换为字节流,
//FileWriter:
//PrintWriter:向文本输出流的打印对象的格式化表示
//
//java预先定义了三个流对象
//System.in:标准输入流,默认外设设备为键盘
//System.out:标准输出流,默认外设设备为控制台屏幕
//System.err:标准错误流,默认外设设备为控制台屏幕
//System类的所有属性均为static型的
//
//
//Scanner类
//位于java.util包中，用于接收键盘输入，文件输入
//提供了多个构造器，可以接受文件、输入流、字符串作为数据源，用于从文件、输入流、字符串中解析数据。
//hasNextXxx()判断是否还有下一个输入项
//nextXxx()录取下一个输入项
//hasNextLine()判断输入源中是否还有下一行
//nextLine()返回输入源中下一行字符串
//
//
//
//
//
//
//

public class Revise_IO {

	public static void main(String[] args) throws IOException {
//		InputStreamReader isr=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(isr);
//		String strLine;
//		while((strLine=br.readLine())!=null)
//		{
//			System.out.println(strLine);
//		}
//		br.close();
		
//		FileOutputStream fos=new FileOutputStream("D:/revise.txt",true);
//		PrintStream ps=new PrintStream(fos);
//		ps.println("真实的人类");
//		ps.println("3.0");
//		ps.println("2.0");
//		fos.close();
//		ps.close();
//		fos=new FileOutputStream("D:/revise.txt",true);
//		PrintWriter pw=new PrintWriter(fos);
//		pw.println("This is PrintWriter");
//		fos.close();
//		pw.close();
		
//		Scanner scanf=new Scanner(System.in);
//		while(scanf.hasNextInt())
//		{
//			System.out.println(scanf.nextInt());
//		}
//		scanf.close();
		
//		Scanner scanf=new Scanner(new FileInputStream("D:/Transactions.txt"));
//		while(scanf.hasNextLine())
//		{
//			System.out.println(scanf.nextLine());
//		}
//		scanf.close();
		
		
		
	}
}
//内存数组流
//流的源和目的地除了可以是文件外，还可以是内存。内存数组流就是和内存中的数组相关的流，可以将数组写入到流中，也可以将数组从输入流中读出来，不涉及磁盘
//内存数组输出流可以看作一个可自动扩容的数组，可以在里面写字节/字符
//字节数组流ByteArrayInputStream和ByteArrayOutPutStream，分别使用字节数组作为流的源和目的地
//CharArrayInputStream和CharArrayOutPutStream
//无需关闭
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
