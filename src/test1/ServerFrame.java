package test1;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerFrame extends JFrame{
	JLabel ServerSet = new JLabel("服务器设置");
	JLabel port = new JLabel("port:");
	JLabel SayL = new JLabel("Say:");

	JTextField Port = new JTextField();
	JTextField Say = new JTextField();

	JButton Start = new JButton("Start");
	JButton SayB = new JButton("Say");
	
	JTextArea Content = new JTextArea();
	
	
	public static void main(String[] args) {

	}
	public ServerFrame() {
		Container contentpane=getContentPane();
		
	}
}






















