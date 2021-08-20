package multithreading;
/*
 * 
 * 方式2：实现Runnable接口
 * 1.创建一个实现Runnable接口的类
 * 2.该类实现Runnable中的run()
 * 3.创建类的对象
 * 4.将此对象作为参数传给Thread的构造器
 * 5.通过Thread调用start()
 * */
public class RunnableTest {

	public static void main(String[] args) {
//		再次开启一个线程不需要new MyThread_ 只需要new Thread
		MyThread_ t=new MyThread_();
		
		
		new Thread(t).start();
		new Thread(t).start();
	}

}
class MyThread_ implements Runnable
{
	public MyThread_() {}
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName()+": "+i);
	}
}