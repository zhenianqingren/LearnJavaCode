package Revise;

/*
 * 进程：处于运行过程中的程序，具有一定独立功能 系统进行资源调度和分配的一个独立单位
 * 线程：程序内部的一段连续的控制流程
 * 关系：线程是进程的组成部分，一个进程可以拥有多个线程，一个线程必须有一个父进程
 * 线程可以有自己的堆栈，程序计数器和局部变量，但不再拥有系统资源，它与父进程的其他线程共享该进程所拥有的全部资源
 * 
 * 
 * 单CPU实现多线程的并行执行
 * 划分极短的CPU时间片，各线程轮流占用一个时间片
 * 每个Java程序都有一个缺省主线程
 * Java应用程序总是从主线程的main()开始执行，main()执行过程中可以创建其他线程
 * 若main()方法中创建了其他线程，在主线程和其他线程之间轮流切换进行，保证每个线程都有机会使用CPU
 * 程序中所有线程结束时，Java应用程序才结束
 * 
 * **/
public class Revise_Thread {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("主线程");
		for (int i = 0; i < 5; i++) {
			if (i == 2)
				new Thread(new MyThread()).start();
			else {
				System.out.println(Thread.currentThread().getName() + i);
				Thread.sleep(300);
			}
		}
	}

}

//线程的五种状态
//新建(New) new关键字创立后，分配了内存，初始化了其成员变量的值
//当处于新建状态时，可以通过Thread类的方法设置线程的属性，如线程的优先级(setPriority)线程名(setName)和线程类型(setDaemon)等
//Daemon:守护线程 一般用于在后台为其他线程提供服务 isDaemon()判断是否是守护线程 setDaemon()设置为守护线程
//
//就绪(Runnable) 调用start()方法，线程已经启动，等待获得CPU时间片执行，处于可运行状态,若处于运行状态，调用yield()方法后，该线程会被暂时剥夺
//CPU资源，重新进入就绪状态
//
//运行(Running) 获得CPU时间片的线程开始执行，系统真正执行run()方法，可以通过isAlive()判断线程是否处于就绪/运行状态
//
//阻塞(Blocked) 一个正在运行的线程不能进行运行时进入阻塞状态
//可能有如下原因：调用了sleep()使其进入休眠状态
//调用wait()使线程挂起，直到线程得到了notify()或notifyAll()消息，线程才会进入就绪状态
//(notify()唤醒等待队列中的第一个等待同一共享资源的线程，并使该线程退出等待行列，进入可运行状态
//notifyAll()使所有正在等待队列中同一共享资源的线程从等待状态退出，进入可运行状态，此时，优先级最高的线程先执行
//)
//线程在等待某个输入/输出完成
//线程试图在某个对象上调用其同步控制方法，但是对象锁不可用 如：当多个线程试图进入某个同步区域(synchronized)，没能进入该同步区域的线程会被置入
//锁定集(Lock Pool)，直到获得该同步区域的锁，进入就绪状态
//
//死亡(Dead)线程在run()方法执行完毕后会进入死亡状态。如果执行了interrupt()或stop()方法，那么它也会以异常退出的方式进入死亡状态
//
//线程退出的三种方法
//1.run()执行完毕后正常退出
//2.stop()方法强行终止
//3.interrupt()方法终止
//
//
//
//创建线程：继承Thread类和实现Runnable()接口
class MyThread implements Runnable {

	public void run() {
		Thread.currentThread().setName("实现了Runnable接口的线程");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

}
//线程同步
//为了防止多个线程访问同一个对象时对数据造成破坏
//线程同步是保证多线程安全访问和竞争资源的一种手段
//
//同步和锁
//Java中每个对象都有一个内置锁
//获得一个对象的锁也称为获得锁、锁定对象、在对象上锁定或在对象上同步。当程序运行到synchronized同步方法或代码块时该对象锁才起作用
//一个线程获得锁，其他线程就不能获得，直到那个线程释放锁，是指持锁进程退出了synchronized同步方法或代码块
//
//Java中的线程同步 需要完成以下两个操作
//1.把竞争访问的资源标识为private
//2.使用synchronized修饰方法或代码块
//
//sleep(1000) 大于等于1000
//yield()放弃当前对CPU的占有，但一旦放弃便又同时与其他线程一起参与竞争
//
//
//interrupt()方法用来吵醒休眠的线程
//当一些线程调用sleep()方法处于休眠状态时，一个占有CPU资源的线程可以让休眠的线程调用interrupt方法吵醒自己，即导致休眠的线程发生，
//
//线程的联合
//线程A在执行期间调用B.join(),那么线程A将立即中断执行，一直等待B执行完毕后再排队等待CPU资源，以便恢复执行，若B已执行完毕，则不会产生任何效果
//
//
//
//




