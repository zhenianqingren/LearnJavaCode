package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class JavaClass {

	public static void main(String[] args) {
		try {
			URL hfut=new URL("http://www.hfut.edu.cn/");//指定URL
			URLConnection connect=hfut.openConnection();//建立连接
			BufferedReader in=new BufferedReader(new InputStreamReader(connect.getInputStream()));//准备读入
			String inputLine;
			while((inputLine=in.readLine())!=null)//读入html文件
				System.out.println(inputLine);
			in.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
