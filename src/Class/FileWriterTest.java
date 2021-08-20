package Class;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//若不存在会自动创建
		File file=new File("D:\\javat1.txt");
		
		
		//true代表不覆盖原有文件继续追加
		FileWriter fw=new FileWriter(file,true);
		
		fw.write('\n'+"test");
		
		
		
		fw.close();//一定要关掉，否则写入会不成功
	}

}
