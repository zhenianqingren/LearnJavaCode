package homework;

import java.util.Scanner;

//已知圆球体积为4/3πr3，试编写一个程序，输入圆球半径，经过计算输出圆球的体积
class Circle
{
	double Pi=3.1415926;//圆周率
	double R;//圆的半径
	double Area(double R) {this.R=R;return 4.0/3*Pi*R*R*R;}//计算半径
}


public class CalR {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		System.out.println("请输入圆的半径");
		System.out.println(new Circle().Area(scanf.nextDouble()));
	}
}
