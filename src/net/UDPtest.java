package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 
 * UDP协议的网络编程
 * 
 * */
public class UDPtest {
	//接收方
	public void sender() throws IOException {
		DatagramSocket socket=new DatagramSocket();
		
		String str="发送消息";
		byte data[]=str.getBytes();
		InetAddress inet=InetAddress.getLocalHost();
		DatagramPacket packet=new DatagramPacket(data,0,data.length,inet,7000);
		
		socket.send(packet);
		socket.close();
	}
	//发送方
	public void receiver() throws IOException {
		DatagramSocket socket=new DatagramSocket(7000);
		byte buffer[]=new byte[1024];
		int len;
		DatagramPacket packet=new DatagramPacket(buffer,0,buffer.length);
		
		socket.receive(packet);
		System.out.println(new String(packet.getData(),0,packet.getLength()));
	}
	public static void main(String[] args) throws IOException {
		new UDPtest().sender();
	}

}











