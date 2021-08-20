package Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 
 * 转换流：属于字符流
 * InputStreamReader	将一个字节的输入流转换为一个字符的输入流
 * OutputStreamReader	将一个字符的输出流转换为一个字节的输出流
 * 
 * 提供字节流与字符流之间的转换
 * 
 * 
 * 
 * */
public class TransStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("D:\\dbcp.txt"));
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		FileOutputStream fos=new FileOutputStream(new File("D:\\dbcp_gbk.txt"));
		OutputStreamWriter osr=new OutputStreamWriter(fos,"UTF-8");
		
		
		char cbuf[]=new char[1024];
		int len;
		while((len=isr.read(cbuf))!=-1)
		{
			osr.write(cbuf,0,len);
		}
		
		
		
		osr.close();
		isr.close();
		fis.close();
		fos.close();
	}

}
