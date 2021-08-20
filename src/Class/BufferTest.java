package Class;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 处理流之一：缓冲流的使用
 * 
 * 提供流的读取、写入速度
 * 
 * 
 * */
public class BufferTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//实现非文本文件的复制
//		1.造文件
		File srcFile=new File("D:\\ea.jpg");
		File destFile=new File("D:\\copy_ea.jpg");
//		2.造流
//		造节点流
		FileInputStream fis=new FileInputStream(srcFile);
		FileOutputStream fos=new FileOutputStream(destFile);
//		造处理流(缓冲流)
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		byte buffer[]=new byte[10];
		int len;
		while((len=bis.read(buffer))!=-1)
		{
			bos.write(buffer,0,len);
//			bos.flush();刷新缓冲区
		}
//		要先关闭外层流 再关闭内层流
//		BufferedReader
//	可以用readLine一次读取一行 不会读到换行符
//		条件为(String)data!=null
//		
		bis.close();
		bos.close();
		fis.close();
		fos.close();
	}
	

}
