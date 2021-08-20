package test1;

public class Thread_1 {

	public static void main(String[] args) {
		new Thread1().start();
		new Thread2().start();
		Thread3 t=new Thread3();
		new Thread(t).start();
		new Thread(t).start();
	}

}
class Thread1 extends Thread
{
	public Thread1()
	{
		
	}
	public void run()
	{
		for(int i=0;i<15;i++)
			System.out.println(Thread.currentThread().getName()+": "+i);
		System.out.println("Thread0 End");
	}
}
class Thread2 extends Thread
{
	public Thread2()
	{
		
	}
	public void run()
	{

		for(int i=0;i<15;i++)
			System.out.println(Thread.currentThread().getName()+": "+i);
		System.out.println("Thread1 End");
	}
}
class Thread3 implements Runnable
{
	public Thread3()
	{
		
	}
	public void run()
	{

		for(int i=0;i<15;i++)
			System.out.println(Thread.currentThread().getName()+": "+i);
		System.out.println("Thread2 End");
	}
}
class Thread4 implements Runnable
{
	public Thread4()
	{
		
	}
	public void run()
	{

		for(int i=0;i<15;i++)
			System.out.println(Thread.currentThread().getName()+": "+i);
		System.out.println("Thread3 End");
	}
}












