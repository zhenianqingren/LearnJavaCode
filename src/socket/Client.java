package socket;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {//从客户端向服务器端传送文件
	Socket socket;//套接字
	String FileName;//文件路径
	public Client() {}
	public Client(String IP,int port,String FileName) {
		try {
			socket=new Socket(IP, port);
			this.FileName=FileName;
		} catch (IOException e) {
			System.out.println("连接异常");
		}
	}//构造器对客户端对象进行初始化
	public static void main(String[] args){
		
		Scanner scanf=new Scanner(System.in);
		String FileName=scanf.next();
		Client client=new Client("127.0.0.1",3000,FileName);//创建对象
		try {
			BufferedOutputStream bos=new BufferedOutputStream(client.socket.getOutputStream());
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.socket.getOutputStream()));
			for(int i=0;i<2;i++) {
				
				if(i==0) {
					bw.write(client.FileName+"\n");
					bw.flush();
					Thread.sleep(1000);//线程休眠，防止读入文件名时混入文件信息
				}//分两次进行信息的传输，第一次传输文件路径，这是为了更好的区分传送的文件类型，不论是txt文本还是jpg图片都可以传输
				
				else {
					FileInputStream fis=new FileInputStream(client.FileName);
					int len;
					byte buffer[]=new byte[1024];
					while((len=fis.read(buffer))!=-1)
						bos.write(buffer, 0, len);
					bos.flush();
				}//第二次传输文件
				
			}
			
		} catch (IOException e) {
			System.out.println("连接异常");
		} catch (InterruptedException e) {
			System.out.println("线程异常");
		}
		
		System.out.println("完毕");
	}	
}





