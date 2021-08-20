package net;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * 
 * URL:统一资源定位符，对应着互联网的某一资源地址
 * 格式：
 * http://localhost:7000/examples/beauty.jpg?username=Tom
 * 协议     主机名     端口号  资源地址      参数列表
 * 
 * */
public class URLtest {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://localhost:7000/examples/beauty.jpg?username=Tom");
			System.out.println(url.getProtocol());//获得协议名
			System.out.println(url.getHost());//获得主机名
			System.out.println(url.getPort());//获得端口号
			System.out.println(url.getPath());//获得文件路径
			System.out.println(url.getFile());//获得文件名
			System.out.println(url.getQuery());//获得查询名
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
