package Class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 数据流
 * DataInputStream和DataOutputStream 是按字节操作的 
 * 用于读取和写入基本数据类型和字符串
 * 
 * 读取的对象是在内存 因此打开文本文件必然乱码
 * 读取顺序要与写入顺序一致
 * 
 * **/
public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(new File("D:\\showtest.txt")));
		dos.writeUTF("小苹果");
		dos.flush();
		dos.writeInt(77);
		dos.flush();
		dos.writeBoolean(false);
		dos.flush();
		
		dos.close();
		
		DataInputStream dis=new DataInputStream(new FileInputStream(new File("D:\\showtest.txt")));
		String name=dis.readUTF();
		int age=dis.readInt();
		boolean lead=dis.readBoolean();
		System.out.println(name);
		System.out.println(age);
		System.out.println(lead);
	}

}












