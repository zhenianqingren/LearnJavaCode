package com.atguigu.contact;


/*
 * 
 * main()方法作为程序入口
 * main()也是一个普通的静态方法
 * main()方法可以作为与控制台交互的方式（之前：使用Scanner）
 * 
 * */
public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.main(new String[100]);
	}

}

class Main {
	public static void main(String args[]) {
		for (int i = 0; i < args.length; i++) {
			args[i] = "args_" + i;
			System.out.println(args[i]);
		}
	}

}
