package homework;

import java.util.Scanner;

class TransC {
	double C;//摄氏温度
	double F;//华氏温度
	double transform(double C) {return F=9.0/5*C+32;}//转换方法
}

public class CtoF
{
	public static void main(String args[])
	{
		Scanner scanf=new Scanner(System.in);
		System.out.println("输入要转换的摄氏温度");
		System.out.println(new TransC().transform(scanf.nextDouble()));
	}
}
