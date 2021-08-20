package experiment;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client {

	public static void main(String[] args) throws IOException {
		ClientFrame client=new ClientFrame();//开启界面
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client.setVisible(true);
		
	}

}
class ClientFrame extends JFrame
{
	JLabel ClientSet=new JLabel("客户机设置");
	JLabel serverIP=new JLabel("Server IP:");
	JLabel serverPort=new JLabel("Server Port:");
	JLabel SayL=new JLabel("Say:");
	
	JTextField ServerIP=new JTextField("127.0.0.1");
	JTextField ServerPort=new JTextField();
	JTextField Say=new JTextField();
	
	JButton Connect=new JButton("Connect");
	JButton SayB=new JButton("Say");
	JTextArea Content=new JTextArea();//必要的组件
	
	Socket socket=null;
	OutputStream os=null;//必要的套接字与输出流

	public ClientFrame()
	{
		super("客户端");
		Container contentpane=getContentPane();
		contentpane.setBackground(new Color(220,220,220));
		contentpane.setLayout(null);

		
		contentpane.add(ClientSet);
		contentpane.add(serverIP);
		contentpane.add(ServerIP);
		contentpane.add(serverPort);
		contentpane.add(ServerPort);
		contentpane.add(Connect);
		contentpane.add(Content);
		contentpane.add(SayL);
		contentpane.add(Say);
		contentpane.add(SayB);
		
		ClientSet.setBounds(5,5,70,25);
		serverIP.setBounds(5,35,60,30);
		ServerIP.setBounds(68,35,170,30);
		serverPort.setBounds(242,35,80,30);
		ServerPort.setBounds(325,35,160,30);
		Connect.setBounds(488,35,85,30);
		Content.setBounds(40,100,500,350);
		SayL.setBounds(5,490,30,30);
		Say.setBounds(38,490,430,30);
		SayB.setBounds(480,490,80,30);
		
		setSize(600, 600);//界面外观的调整
		
		Connect.addActionListener(new ActionListener() {
			int portNum;
			String IP;//端口号与IP
			public void actionPerformed(ActionEvent e) {//点击Connect后触发的操作
				Connect.setEnabled(false);
				Content.setText("Connect to server……\n");
				portNum=Integer.parseInt(ServerPort.getText());
				IP=ServerIP.getText();//从输入框中获取IP和端口号
				try {
					socket=new Socket(IP,portNum);
					os=socket.getOutputStream();
					new ClientThread().start();//初始化套接字与输出流，并开启接受消息的线程
				} catch (UnknownHostException e1) {
					System.out.println("未知的主机");
				} catch (IOException e1) {
					System.out.println("或许未找到主机，未知流无法连接");
				}
			}
		});
		
		SayB.addActionListener(new ActionListener() {//点击Say后触发的操作
			public void actionPerformed(ActionEvent e) {
				String saying=Say.getText();
				try {
					OutputStreamWriter osw=new OutputStreamWriter(os);
					osw.write(saying+"\n");
					osw.flush();
					Say.setText("");//获取输入框的文字并写入到流中，然后清空输入框
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	class ClientThread extends Thread
	{
		public void run()
		{
			try {
				InputStream is=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				int len;
				char buffer[]=new char[1024];
				while((len=isr.read(buffer))!=-1)
					Content.append(new String(buffer,0,len));//另外开启一个线程负责接收消息
			} catch (IOException e) {
				System.out.println("Socket已关闭");
			}
		}
	}
}













