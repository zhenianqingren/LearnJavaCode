package net;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端发送文件给服务端
//服务端将文件保存在本地
public class TCPTest2 {
	public static void client(String FileName) {
		try {
			Socket socket = new Socket("127.0.0.1", 8888);
			OutputStream os = socket.getOutputStream();
			FileInputStream fis = new FileInputStream(FileName);
			byte buffer[] = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) != -1)
				os.write(buffer, 0, len);
			if (fis != null)
				fis.close();
			if (os != null)
				os.close();
			if (socket != null)
				socket.close();

		} catch (UnknownHostException e) {
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

	public static void server(String CopyName) {
		try {
			ServerSocket ss = new ServerSocket(8888);
			Socket socket = ss.accept();
			InputStream ins = socket.getInputStream();
			FileOutputStream fos = new FileOutputStream(CopyName);
			byte buffer[] = new byte[1024];
			int len;
			while ((len = ins.read(buffer)) != -1)
				fos.write(buffer, 0, len);
			if (fos != null)
				fos.close();
			if (ins != null)
				ins.close();
			if (socket != null)
				socket.close();
			if (ss != null)
				ss.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

	public static void main(String[] args) {
		String FileName="D:/ea.jpg";
		String getSuffix[] = FileName.split("\\.");
		String CopyName = "D:/Copy." + getSuffix[1];

		server(CopyName);
		client(FileName);
		System.out.println(CopyName);
	}

}
