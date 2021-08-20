package Revise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;


//IP地址：确定主机
//IPv4是一个32位的二进制数，表示成四个十进制数，各取0-255，每个值用.分隔 如192.168.2.1
//最新的IPv6使用128位来表示，采用十六进制表示 如 ABCD:EF01:2345:6789:ABCD:EF01:2345:6789
//人们给每一个节点起一个名字，把名字与IP地址建立一一对应的关系，这就是域名系统DNS

//端口：指明计算机的应用程序
//用两个字节表示，范围为0-65535，低于1024不要使用
//同一协议下端口号不能重复，不同协议下可以
//公认端口 0-1023，一些操作系统中只有管理员可以使用
//21：FTP协议 用于文件传输
//22：SSH协议，用于安全的远程连接
//25：SMTP，简单邮件传输协议，用于发送电子邮件
//80：HTTP：超文本传输协议
//
//注册端口1024-49151，松散绑定一些服务
//Tomcat服务器：8080
//Oracle服务器：1521
//Mysq数据库：3306
//动态端口/私有端口：49152-65535，一般应用程序不主动使用它
//
//统一资源定位符
//在www上，每一信息资源都有统一且唯一的地址，该地址就叫URL，是www的统一资源标识符
//例:http://email.hfut.cn:80/index.html
//http:超文本传输协议，表示该资源类型是超文本信息
//email.hfut.cn 合肥工业大学邮件服务器的主机域名
//80 HTTP的端口号
//index.html 资源文件名
//
//
//

public class Revise_Socket {

	public static void main(String[] args) throws IOException {
				InetAddress test=InetAddress.getByName("www.baidu.com");
				System.out.println(test);
				System.out.println(test.getHostAddress());
				System.out.println(test.getHostName());
		
//		绝对路径构建URL
//		URL url1=new URL("http://www.baidu.com:80/index.html#aa");
//		相对路径构建URL
//		URL url2=new URL("http://www.baidu.com:80/a/");
//		url2=new URL(url2,"b.txt");
//		System.out.println(url2.toString());
		
//		URL url3=new URL("http://www.baidu.com:80/index.html#aa?uname=hfut");
//		System.out.println("协议："+url3.getProtocol());
//		System.out.println("域名："+url3.getHost());
//		System.out.println("端口："+url3.getPort());
//		System.out.println("资源："+url3.getFile());
//		System.out.println("相对路径："+url3.getPath());
//		System.out.println("锚点："+url3.getRef());
//		System.out.println("参数："+url3.getQuery());
		
//		URL hfut=new URL("http://www.hfut.edu.cn");
//		URLConnection test=hfut.openConnection();
//		BufferedReader bis=new BufferedReader(new InputStreamReader(test.getInputStream()));
//		String inputLine;
//		while((inputLine=bis.readLine())!=null)
//			System.out.println(inputLine);
//		bis.close();
	}

}

//计算机网络的分层模型
//OSI理论推荐分层模型，又称为开放系统互联模型
//简化：TCP/IP模型
//协议：
//TCP协议：Internet的基础和核心 面向连接
//优点：通信前建立连接，安全，可靠
//缺点：等待对方回应，速度较慢，效率较差
//UDP协议：从一台计算机到另一台计算机发送称为数据包的独立数据包的协议，非面向连接
//不需要建立连接，速度较快
//安全性较差，不能保证顺利发送
//
//
//把提供资源的计算机叫做服务器，把使用资源的计算机称为客户机
//
//Java中，有一个用来存储internet地址的类叫做InetAddress
//public static InetAddress getLocalHost()
//public static InetAddress getByName(String host)给定主机名，确定主机地址
//public String getHostName() 获得IP地址对应的主机名

//InetSocketAddress类
//封装端口：在InetAddress的基础上封装端口
//InetSocketAddress(InetAddress addr,int port)根据IP地址和端口号创建套接字地址
//InetSocketAddress(int port)IP地址为通配符地址
//InetSocketAddress(String hostname,int port)根据主机名和端口号创建套接字地址
//
//Java提供的网络功能有三大类：URL,Socket,Datagram
//
//Socket是网络上运行的程序之间双向通信链路的最后终结点
//IP与端口的组合得出一个套接字
//Socket可以同时与多个客户端进行通信，URL只能与一个客户端进行通信
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//




































