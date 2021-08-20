package Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 
 *System类的setIn(InputStream is) /setOut(PrintStream ps) 方式重新指定输入和输出的流
 * 
 * PrintStream和PrintWriter
 * 提供了一系列重载的Print()和println
 * 
 * 
 * 
 * 
 * 
 * */
public class PrintTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps=null;
		FileOutputStream fos=new FileOutputStream(new File("D:\\showtest.txt"));
		ps=new PrintStream(fos,true);
		System.setOut(ps);
		for(int i=0;i<256;i++)
		{
			System.out.print((char)i);
			if(i%30==0)
				System.out.println();
		}
	}

}
