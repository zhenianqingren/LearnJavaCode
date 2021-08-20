package thread;

import java.util.Vector;

public class ThreadTest {

	public static void main(String[] args) {
		new Cal_1_Thread(false).start();//开启计算2~1000000之间的质数的线程 不选择打印
		new Cal_2_Thread(false).start();//开启计算1000000~2000000之间的质数的线程 不选择打印
	}
}

class Cal_1_Thread extends Thread {
	Vector<Long> v;//成员变量用于保存2~1000000之间的质数
	boolean is_Print;//是否打印出这些质数 true为打印 false为不打印 因为数目巨大，打印后控制台有可能显示不完全
	
	public Cal_1_Thread(boolean is_Print) {
		super();
		this.v = new Vector<Long>();
		this.is_Print=is_Print;//初始化成员变量
	}

	public void run() {
		this.setName("2~1000000之间的线程");//重新设置该线程的名字
		System.out.println(this.getName());
		this.v.add(2L);//将质数2放入
		L: for (long i = 3; i <= 1000000; i++) {
			for (long j = 2; j < (long) Math.sqrt(i) + 1; j++) {
				if (i % j == 0)
					continue L;
			}
			this.v.add(i);
		}//找出质数
		System.out.println("质数的个数为:" + this.v.size());

		if(is_Print)//是否打印
			Print();
	}
	public void Print()
	{
		int k = 1;
		for (int i = 0; i < v.size(); i++, k++) {
			System.out.print(v.get(i) + " ");
			if (k == 7) {
				System.out.println();
				k=0;
			}
		}
	}
}

class Cal_2_Thread extends Thread {
	Vector<Long> v;//成员变量用于保存1000000~2000000之间的质数
	boolean is_Print;//是否打印出这些质数 true为打印 false为不打印
	public Cal_2_Thread(boolean is_Print) {
		super();
		this.v = new Vector<Long>();
		this.is_Print=is_Print;//初始化成员变量
	}

	public void run() {
		this.setName("1000000~2000000之间的线程");//重新设置该线程的名字
		System.out.println(this.getName());
		L: for (long i = 1000000; i <= 2000000; i++) {
			for (long j = 2; j < (long) Math.sqrt(i) + 1; j++) {
				if (i % j == 0)
					continue L;
			}
			this.v.add(i);
		}
		System.out.println("质数的个数为:" + this.v.size());//找出质数

		if(is_Print)//是否打印
			Print();
	}
	public void Print()
	{
		int k = 1;
		for (int i = 0; i < v.size(); i++, k++) {
			System.out.print(v.get(i) + " ");
			if (k == 7) {
				System.out.println();
				k=0;
			}
		}
	}
}
















