package otherStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 1.直接继承于Object类 实现了DataInput和DataOutput接口
 * 2.既可以作为输入流也可以作为输出流
 * 3.向已有文件写入时会覆盖原有内容,但不会覆盖全部内容
 * 
 * 
 * 
 * 
 * */
public class RandomAccessibleFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf1=new RandomAccessFile("D:/ea.jpg", "rw");
		RandomAccessFile raf2=new RandomAccessFile("D:/eacopy.png","rw");
		byte buffer[]=new byte[1024];
		int len;
		while((len=raf1.read(buffer))!=-1)
		{
			raf2.write(buffer,0,len);
		}
//		getFilePointer()获取当前位置
//		seek((int)ptr);定位插入的位置
		raf1.close();
		raf2.close();
//		第二个参数代表mode
//		r:以只读方式打开 rw:打开读取和写入 rwd:打开读取和写入，同步文件内容的更新 rws:打开读取和写入，同步文件内容和元数据的更新
	}

}











