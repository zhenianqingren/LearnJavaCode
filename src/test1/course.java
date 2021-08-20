package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class course {
public static void main(String args[])
{
	try {
		BufferedReader br=new BufferedReader(new FileReader("D:/test.txt"));
		System.out.print(br.readLine());
		System.out.println("test");
		br.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
