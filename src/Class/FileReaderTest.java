package Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:\\hello.txt");
		FileReader fr1=new FileReader(file);
		FileReader fr2=new FileReader(file);
		FileReader fr3=new FileReader(file);
		int data;
		//read()如果打到末尾 返回-1 否则返回一个字符
		while((data=fr1.read())!=-1)
			System.out.print((char)data);
		
		System.out.println();
		//read(char cbuf[])返回读入的字符数 到达末尾时返回-1
		int len;
		char cbuf[]=new char[5];
		while((len=fr2.read(cbuf))!=-1)
		{
			for(int i=0;i<len;i++)
				System.out.print(cbuf[i]);
		}
		System.out.println();
		while((len=fr3.read(cbuf))!=-1)
		{
			String str=new String(cbuf,0,len);
			System.out.print(str);
		}
		//关闭操作
		fr1.close();
		fr2.close();
	}

}
