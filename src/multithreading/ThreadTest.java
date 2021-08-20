package multithreading;

/*
 * 多线程的创建 方式一：继承于Thread类
 * 1.创建一个Thread子类
 * 2.重写run-->将子线程执行的操作写入其中
 * 3.创建子类对象
 * 4.通过对象调用start
 * 
 * 例子：遍历100以内所有偶数
 * */
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread().start();
//		必须通过start :启动当前线程 调用run()
//		一个线程对象只能start一次
//		如下操作依旧在main中执行
		for (int i = 1; i <= 50; i++)
			if (i % 2 == 0)
				System.out.println(Thread.currentThread().getName() + "test");
	}

}

class MyThread extends Thread {
	public MyThread() {

	}

	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println(Thread.currentThread().getName() + i);
			if(i%20==0)
				this.yield();//释放一下执行权，让给其他线程
		}
	}
}
