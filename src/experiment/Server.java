package experiment;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.ServerException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerFrame server = new ServerFrame();//启动

		server.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		server.setVisible(true);

	}

}

class ServerFrame extends JFrame {
	JLabel ServerSet = new JLabel("服务器设置");
	JLabel port = new JLabel("port:");
	JLabel SayL = new JLabel("Say:");

	JTextField Port = new JTextField();
	JTextField Say = new JTextField();

	JButton Start = new JButton("Start");
	JButton SayB = new JButton("Say");

	JTextArea Content = new JTextArea();//必要界面组件
	ServerSocket ss = null;
	Socket socket = null;//负责通信的对象成员

	public ServerFrame() {
		super("服务端");
		Container contentpane = getContentPane();
		contentpane.setBackground(new Color(220, 220, 220));
		contentpane.setLayout(null);

		contentpane.add(ServerSet);
		contentpane.add(port);
		contentpane.add(Port);
		contentpane.add(Start);
		contentpane.add(Content);
		contentpane.add(SayL);
		contentpane.add(Say);
		contentpane.add(SayB);

		ServerSet.setBounds(5, 5, 70, 25);
		port.setBounds(5, 35, 30, 30);
		Port.setBounds(38, 35, 430, 30);
		Start.setBounds(480, 35, 80, 30);
		Content.setBounds(40, 100, 500, 350);
		SayL.setBounds(5, 490, 30, 30);
		Say.setBounds(38, 490, 430, 30);
		SayB.setBounds(480, 490, 80, 30);//界面的初始化

		Start.addActionListener(new ActionListener() {//点击Start按钮后触发的操作
			public void actionPerformed(ActionEvent e) {
				Content.append("Server Starting……\n");
				Start.setEnabled(false);
				try {
						try {
							ss = new ServerSocket(Integer.parseInt(Port.getText()));//初始化ServerSocket
						} catch (ServerException e1) {
							Content.append("连接失败");
						}
						
						socket = ss.accept();//准备接受套接字
						Content.append("Client Connected" + "\n");

				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				ServerThread st = new ServerThread();
				st.start();//开启线程，负责监听消息
			}
		});

		SayB.addActionListener(new ActionListener() {//点击Say后触发的操作
			public void actionPerformed(ActionEvent e) {
				try {
					OutputStream os = socket.getOutputStream();
					OutputStreamWriter osw = new OutputStreamWriter(os);
					String str = Say.getText();
					osw.write(str + "\n");
					osw.flush();//将对话框中输入的文字发送给客户端
					Say.setText("");//发送后清空对话框
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		setSize(600, 600);

	}

	class ServerThread extends Thread {
		public void run() {
			try {
				InputStreamReader in = new InputStreamReader(socket.getInputStream());
				int len;
				char buffer[] = new char[1024];
				while ((len = in.read(buffer)) != -1)
					Content.append(new String(buffer, 0, len));//接收消息的线程，从套接字中进行消息读取

			} catch (Exception e) {
				System.out.println("Socket已关闭");
			}
		}
	}

}
