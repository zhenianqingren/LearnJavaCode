package streamHomework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter(new File("D:/name.txt"),true);//造流，指明操作路径 不覆盖原有内容
		Scanner scanf=new Scanner(System.in);//准备输入对象
		String str=null;//获取姓名
		do
		{
			System.out.println("请输入姓名：");
			str=scanf.nextLine();//获取输入
			fw.write(str+"\n");//写入到文件中
			
		}while(str.length()!=0&&!str.isBlank());//当输入空白或空格时结束输出
		fw.close();//关闭流
		System.out.println("End");
	}

}
