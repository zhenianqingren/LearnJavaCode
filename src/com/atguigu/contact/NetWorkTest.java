package com.atguigu.contact;
/*
 * 接口的应用：代理模式
 * 
 * 
 * 
 * 
 * 
 * */
public class NetWorkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new ProxyNet(server).Browse();
	}

}
interface NetWork
{
	void Browse();
}
//被代理类
class Server implements NetWork
{
	public void Browse()
	{
		System.out.println("真实服务器访问网络");
	}
}
//代理类
class ProxyNet implements NetWork
{
	private NetWork work;
	public ProxyNet(NetWork work) {this.work=work;}
	public void check()
	{
		System.out.println("联网之前的检查");
	}
	public void Browse()
	{
		check();
		work.Browse();
	}
}



