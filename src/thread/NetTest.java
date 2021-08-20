package thread;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetTest {
//	客户端
	public static void client() {
		Socket s =null;
		OutputStream os = null;
		try {
//			1.创建Socket对象，指明服务端的IP和端口号
			s = new Socket("127.0.0.1", 8237);
//			2.获取输出流，用于输出数据
			os = s.getOutputStream();
//			3.输出数据
			os.write("网络编程测试".getBytes());


		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
//			4.资源关闭
				if (os != null)
					os.close();
				if (s != null)
					s.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

//	服务端
	public static void server() {
		ServerSocket ss = null;
		Socket socket = null;
		ByteArrayOutputStream baos = null;
		InputStream ins = null;
		try {
//			创建服务器端的ServerSocket监听请求，指明自己的端口号
			ss = new ServerSocket(8237);
//			调用accept接受来自客户端的Socket
			socket = ss.accept();
			baos = new ByteArrayOutputStream();
//			获取输入流
			ins = socket.getInputStream();
			byte buffer[] = new byte[20];
			int len;
//			读取数据
			while ((len = ins.read(buffer)) != -1)
				baos.write(buffer, 0, len);
			System.out.println(baos.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
//		关闭资源
		try {
			if (ss != null)
				ss.close();
			if (socket != null)
				socket.close();
			if (baos != null)
				baos.close();
			if (ins != null)
				ins.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		server();
		client();
	}

}
