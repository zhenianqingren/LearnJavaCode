package net;

import java.net.InetAddress;
import java.net.UnknownHostException;
//www.baidu.com
//本机回路地址127.0.0.1 对应着Localhost
//端口号标识正在计算机上运行的进程（程序）
//端口号与IP地址的组合得出一个网络套接字Socket,用于服务端与客户端的通信
public class InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress net1=InetAddress.getByName("192.168.10.14");
		System.out.println(net1);
		System.out.println(InetAddress.getByName("www.baidu.com"));
		System.out.println(InetAddress.getByName("Localhost"));
		System.out.println(InetAddress.getLocalHost());
	}

}
