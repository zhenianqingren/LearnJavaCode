package socket;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket server;//服务器
	Socket socket;//套接字
	String CopyName;//从客户端传送一个文件，服务器进行本地保存时的路径

	public Server() {//默认构造器

	}

	public Server(int port) {
			try {
				server = new ServerSocket(port);
			} catch (IOException e) {
				System.out.println("连接终止");
			}
	}//带参构造器

	public void getFileName() {
		if (socket != null) {//获取服务器传送的文件名,因为不知道是什么格式(txt或者jpg或者png)所以对字符串进行处理
			try {
				BufferedReader bw = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String getSuffix[] = new String(bw.readLine()).split("\\.");//分割后缀
				CopyName = "D:/Copy." + getSuffix[1];//此处默认保存在D盘
				System.out.println("文件路径："+CopyName);
			} catch (IOException e) {
				System.out.println("读取异常");
			}
		}
	}

	public static void main(String[] args) {
		Server server = new Server(3000);//创建服务器对象
		while (true) {
			try {
				server.socket=server.server.accept();
			} catch (IOException e) {
				System.out.println("连接终止");
			}
			server.getFileName();
			if (server.socket != null)
				new ServerThread(server.CopyName, server.socket).start();//在另一个线程中单独进行处理
			else break;
		}

	}
}

class ServerThread extends Thread {//接受文件的线程
	Socket socket;//成员变量：套接字
	String CopyName;//成员变量：保存路径

	public ServerThread(String CopyName, Socket socket) {
		super();
		this.CopyName = CopyName;
		this.socket = socket;
	}//构造器

	public void run() {
		int len = -5;
		try {
			BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
			FileOutputStream fos = new FileOutputStream(CopyName);//造流

			byte buffer[] = new byte[1024];
			while (bis != null && (len = bis.read(buffer)) != -1)
				fos.write(buffer, 0, len);//操纵字节，因为文件可能是图片
			fos.close();//读写文件的常规操作
		} catch (IOException e) {
			System.out.println("连接终止");
		} finally {
			System.out.println("传输完成");
		}
	}
}
