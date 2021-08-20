package Class;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 其他流的使用
 * 1.标准输入输出流
 * 2.打印流
 * 3.数据流
 * 
 * 
 * System.in:属于InputStream 标准输入流 默认从键盘输入
 * 
 * System.out:属于PrintStream 标准输出流 默认从控制台输出
 * 
 * System类的setIn(InputStream is) /setOut(PrintStream ps) 方式重新指定输入和输出的流
 * 
 * PrintStream和PrintWriter
 * 提供了一系列重载的Print()和println
 * */
public class OtherStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		while(true)
		{
			String data=br.readLine();
			if(data.equalsIgnoreCase("e")||data.equalsIgnoreCase("exit"))
			{
				break;
			}
			else {
				String upper=data.toUpperCase();
				System.out.println(upper);
			}
		}
		br.close();
	}

}
