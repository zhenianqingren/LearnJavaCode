package Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FInputStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:\\hello.txt");
		
		FileInputStream fis=new FileInputStream(file);
		//即使char是两个字节，但是英文字母在ASCALL码中的大小决定了他们可以用一个字节表示，不超过255
		int len;
		byte[]buf=new byte[5];
		len=fis.read(buf);
//		while((len=fis.read(buf))!=-1)
//		{
			String str=new String(buf,0,len);
			System.out.print(str);
//		}
		File srcFile=new File("D:\\ea.jpg");
		File destFile=new File("D:\\ea_copy.jpg");
		
		FileInputStream fis_=new FileInputStream(srcFile);
		FileOutputStream fos_=new FileOutputStream(destFile);
		
		byte buffer[]=new byte[5];
		while((len=fis_.read(buffer))!=-1)
		{
			fos_.write(buffer,0,len);
		}
		
		fis_.close();
		fos_.close();
	}

}
