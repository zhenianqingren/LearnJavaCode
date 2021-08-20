package otherStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 对象流的使用
 * 1.ObjectInputStream和ObjectOutputStream
 * 2.作用：用于存储和读取基本数据类型数据或对象的处理流
 * 
 * java对象可序列化需要满足一定要求
 * 
 * */
public class ObjectIOtest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * 序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
		 * 使用ObjectOutputStream实现
		 * */
		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("D:/object.txt"));
		obj.writeObject(new String("IO编程"));
		obj.flush();
		
//		obj.writeObject(new Person("Test",100));
//		obj.flush();
		
		
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/object.txt"));
//		Object temp=ois.readObject();
//		String str=(String)temp;
//		System.out.println(str);
//		temp=ois.readObject();
//		Person p=(Person)temp;
//		System.out.println(p);
//		ois.close();
	}

}
